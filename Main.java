
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josue
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
        h.setFrecuencias(cadena);
        h.setNodos();
        h.setTree();
        h.printTable(h.getTree().getRoot(),"");
        System.out.println("Ingrese un mensaje codificado con los códigos anteriores:");
        String codigo = teclado.nextLine();
        h.decode(codigo, null);
        System.out.println("Mensaje codificado:");
        System.out.println(h.getDecodificado());
    }
}
