
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josue
 */
public class Huffman {
    
    private Arbol<Integer,Character> tree = new Arbol();
    private Heap h = new Heap();
    private ArrayList<Integer> frecuencias = new ArrayList(); //Lista con frecuencias
    private ArrayList<Character> letras = new ArrayList(); //Lista con caracteres.
    private String decodificado;
    
    /**
     *
     */
    public Huffman(){
        decodificado = "";
    }

    /**
     *
     * @param cadena
     */
    public void setFrecuencias(String cadena){
        cadena = cadena.toLowerCase(); //Cambia el mensaje a minúsculas.
        int frec;
        char carac;
        for (int i = 0; i < cadena.length(); i++){ //Analiza cada caracter de la cadena.
            frec = 0;
            carac = cadena.charAt(i);
            if (!letras.contains(carac)){ //Si el caracter no ha sido analizado (no está en la lisa de caracteres),
                for (int j = 0; j < cadena.length(); j++){ //cuenta el número de veces que se repite el caracter.
                    if (carac == cadena.charAt(j)) //por cada vez que se repite, suma 1 a su frecuencia.
                        frec++;
                }
                frecuencias.add(frec); //Añade la frecuencia de dicho caracter a la lista de frecuencias.
                letras.add(carac); //Añade el caracter a la lista de caracteres en la misma posición que al caracter.
            }
        }
    }
    
    /**
     *Genera un nodo por cada pareja caracter-frecuencia y el heap los ordena de tal forma que los de menor frecuencia se remuevan primero.
     */
    public void setNodos(){
        for (int i = 0; i < frecuencias.size(); i++){
            Nodo<Integer,Character> temporal = new Nodo(frecuencias.get(i),letras.get(i),null,null);
            h.getNodos().add(temporal);
        }
    }
    
    /**
     *
     */
    public void setTree(){
        int acumulada; //Frecuencia acumulada
        Nodo<Integer,Character> temporal; //Se inicializan tres nodos para realizar las acciones correspondientes.
        Nodo<Integer,Character> temporal2;
        Nodo<Integer,Character> raiz;
        while (h.getNodos().size() > 0){ //Mientras hayan nodos que organizar...
            temporal = h.getNodos().remove(); //Se remueve uno.
            if (h.getNodos().size() > 0 && tree.getRoot() == null){ //Si puede removerse otro...
                temporal2 = h.getNodos().remove(); //Se remueve.
                acumulada = temporal.getFrecuencia() + temporal2.getFrecuencia(); //Se suman sus frecuencias y se ponen en la nueva raíz.
                raiz = new Nodo(acumulada,' ',null,null); //La nueva raíz toma ambos temporales como sus hijos y se coloca como raíz.
                raiz.setIzquierdo(temporal2);
                raiz.setDerecho(temporal);
                tree.setRoot(new Nodo(raiz));
            }
            else{ //Si el árbol no tiene más elementos que remover o si ya tiene una raíz. Se corre este código si solo existe un elemento.
                if (tree.getRoot() == null){ //Si no tiene raíz...
                    acumulada = temporal.getFrecuencia(); //Se crea una nueva raíz y copia la frecuencia de su nuevo nodo hijo (temporal).
                    raiz = new Nodo(acumulada,' ',null,temporal);
                    tree.setRoot(raiz);
                }
                else{
                    acumulada = tree.getRoot().getFrecuencia() + temporal.getFrecuencia(); //Se acumula toda la frecuencia.
                    raiz = new Nodo(tree.getRoot()); //Se crea una copia de la raíz.
                    tree.getRoot().setDerecho(raiz); //Dicha copia se coloca a la derecha de la raíz.
                    tree.getRoot().setIzquierdo(temporal); //El nuevo nodo temporal se coloca a la izquierda.
                    tree.getRoot().setFrecuencia(acumulada); //Se le coloca como frecuencia la frecuencia acumulada total.
                }
            }
        }   
    }

    /**
     *
     * @param nodo
     * @param codigo
     */
    public void printTable(Nodo<Integer,Character> nodo, String codigo){
        if (nodo.getDerecho() == null && nodo.getIzquierdo() == null) //Imprime el hijo de hasta abajo.
            System.out.println("  " + nodo.getValor() + "      " + nodo.getFrecuencia() + "      " + codigo);
        else{
            if (nodo.getIzquierdo() != null) //Si tuvo que cruzar a la izquierda, le concatena un cero a su código.
                printTable(nodo.getIzquierdo(), codigo + "0");
            if (nodo.getDerecho() != null) //Si tuvo que cruzar a la derecha, le concatena un 1 a su código.
                printTable(nodo.getDerecho(), codigo + "1");
        }
    }
    
    /**
     *
     * @param mensaje
     * @param node
     */
    public void decode(String mensaje, Nodo<Integer,Character> node){
        try{
            Nodo<Integer,Character> temp;
            if (node == null) //Si el nodo es nulo, empieza desde la raíz.
                temp = new Nodo(tree.getRoot());
            else
                temp = node; //Si no es nulo, sigue en el mismo nodo.
            if (mensaje.length() > 0){ //Siempre y cuando haya caracteres del código para analizar.
                if (mensaje.charAt(0) == '0'){ //Si el código es cero, obvaiamente es el fin de una ramificación e imprime el valor de dicho nodo.
                    temp = temp.getIzquierdo(); //Busca el hijo izquierdo ya que el código es cero.
                    decodificado = decodificado + temp.getValor(); //concatena el caracter al mensaje decodificado.
                    if (mensaje.length() > 0){
                        mensaje = mensaje.substring(1);
                        decode(mensaje,null); //Es un método recursivo.
                    }
                }
                else if (mensaje.charAt(0) == '1'){ //Si el caracter es uno, analiza si es el final de la rama o si puede continuar a la derecha.
                    temp = temp.getDerecho(); //Avanza a la derecha del árbol al ser '1'.
                    if (temp.getDerecho() == null){ //Si es el fin de la rama, concatena el mensaje del final de la rama.
                        decodificado = decodificado + temp.getValor();
                        if (mensaje.length() > 0){
                            mensaje = mensaje.substring(1);
                            decode(mensaje,null); //Al ser el final, empieza de nuevo desde la raíz.
                        }
                    }
                    else{
                        mensaje = mensaje.substring(1);
                        if (mensaje.length() == 0 && temp.getDerecho() == null){
                            mensaje = "1";
                            decodificado = decodificado + temp.getValor();
                        }
                        else if (mensaje.length() > 0)
                            decode(mensaje,temp); //Si no es fin de la rama, prosigue en el mismo nodo.
                    }
                }
                else{
                    temp = null; //Si se ingresa un caracter inválido, se forza un NullPointerException.
                    char forzarError = temp.getValor();
                }
            }
        }catch(NullPointerException e){
            decodificado = "ERROR. Código inexistente.";
        }
    }
    
    /**
     *
     * @return
     */
    public String getDecodificado(){
        return decodificado;
    }
    
    /**
     *
     * @return
     */
    public Arbol<Integer,Character> getTree(){
        return tree;
    }
}
