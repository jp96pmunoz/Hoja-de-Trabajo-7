
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josue
 * Josué Cifuentes 15275
 * Pablo Muñoz 15258
 */
public class Main {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Huffman h = new Huffman();
        System.out.println("Ingrese una cadena de caracteres a codificar utilizando Árboles de Huffman:");
        String cadena = teclado.nextLine();
        h.setFrecuencias(cadena); //Cuenta las frecuencias de cada caracter contenido en el mensaje ingresado.
        h.setNodos(); //Crea los nodos y los organiza de mayor frecuencia a menor frecuencia.
        h.setTree(); //Genera el árbol sesgado hacia la derecha con jerarquía de frecuencias (mayor frecuencias, menor nivel o sea más arriba en el árbol).
        System.out.println("Char:   Frec:   Código:");
        h.printTable(h.getTree().getRoot(),""); //Imprime la tabla de los caracteres con sus frecuencias respectivas y códigos.
        System.out.println("Frecuencia acumulada: " + h.getTree().getRoot().getFrecuencia()); //Obtiene la frecuencia de la raíz del árbol puesto que será la suma de la frecuencia de todos los caracteres.
        System.out.println("Ingrese un mensaje codificado con los códigos anteriores (Ingrese el código de corrido):");
        String codigo = teclado.nextLine();
        h.decode(codigo, null); //Decodifica el mensaje a letras.
        System.out.println("Mensaje codificado:");
        System.out.println(h.getDecodificado()); //Imprime el mensaje decodificado.
    }
}
