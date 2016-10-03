
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
    private ArrayList<Integer> frecuencias = new ArrayList();
    private ArrayList<Character> letras = new ArrayList();
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
        cadena = cadena.toLowerCase();
        int frec;
        char carac;
        for (int i = 0; i < cadena.length(); i++){
            frec = 0;
            carac = cadena.charAt(i);
            if (!letras.contains(carac)){
                for (int j = 0; j < cadena.length(); j++){
                    if (carac == cadena.charAt(j))
                        frec++;
                }
                frecuencias.add(frec);
                letras.add(carac);
            }
        }
    }
    
    /**
     *
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
        while (h.getNodos().size() > 0){
            Nodo<Integer,Character> temporal = h.getNodos().remove();
            if (h.getNodos().size() > 0 && (tree.getRoot() == null || tree.getRoot().getFrecuencia() > temporal.getFrecuencia())){
                Nodo<Integer,Character> temporal2 = h.getNodos().remove();
                int acumulada = temporal.getFrecuencia() + temporal2.getFrecuencia();
                Nodo<Integer,Character> temporal3 = new Nodo(acumulada,' ',null,null);
                temporal3.setIzquierdo(temporal);
                temporal3.setDerecho(temporal2);
                if (tree.getRoot() == null)
                    tree.setRoot(new Nodo<Integer,Character>(temporal3));
                else{
                    Nodo<Integer,Character> raiz = new Nodo(tree.getRoot());
                    tree.getRoot().setDerecho(raiz);
                    tree.getRoot().setIzquierdo(temporal3);
                }
            }
            else{
                Nodo<Integer,Character> raiz = new Nodo(tree.getRoot());
                tree.getRoot().setDerecho(raiz);
                tree.getRoot().setIzquierdo(temporal);
            }
        }   
    }

    /**
     *
     * @param nodo
     * @param codigo
     */
    public void printTable(Nodo<Integer,Character> nodo, String codigo){
        if (nodo.getDerecho() == null && nodo.getIzquierdo() == null)
            System.out.println(nodo.getValor() +"   "+ nodo.getFrecuencia() +"   "+ codigo);
        else{
            if (nodo.getIzquierdo() != null)
                printTable(nodo.getIzquierdo(), codigo + "0");
            if (nodo.getDerecho() != null)
                printTable(nodo.getDerecho(), codigo + "1");
        }
    }
    
    /**
     *
     * @param mensaje
     * @param node
     */
    public void decode(String mensaje, Nodo<Integer,Character> node){
        Nodo<Integer,Character> temp;
        if (node == null)
            temp = new Nodo(tree.getRoot());
        else
            temp = node;
        if (mensaje.length() > 0){
            if (mensaje.charAt(0) == '0'){
                temp = temp.getIzquierdo();
                decodificado = decodificado + temp.getValor();
                if (mensaje.length() > 0){
                    mensaje = mensaje.substring(1);
                    decode(mensaje,null);
                }
            }
            else if (mensaje.charAt(0) == '1'){
                if (temp.getDerecho() == null){
                    decodificado = decodificado + temp.getValor();
                    if (mensaje.length() > 0){
                        mensaje = mensaje.substring(1);
                        decode(mensaje,null);
                    }
                }
                else{
                    temp = temp.getDerecho();
                    mensaje = mensaje.substring(1);
                    decode(mensaje,temp);
                }
            }
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
