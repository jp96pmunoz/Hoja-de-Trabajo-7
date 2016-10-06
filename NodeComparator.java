
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josue
 * Josué Cifuentes 15275
 * Pablo Muños 15258
 */
public class NodeComparator implements Comparator<Nodo<Integer, Character>> {

    @Override
    //Este comparador se utiliza en el Heap para ordenar los nodos desde el de menor frecuencia al de mayor (se remueven primero los de menor frecuencia).
    public int compare(Nodo<Integer, Character> o1, Nodo<Integer, Character> o2) {
        if (o1.getFrecuencia() < o2.getFrecuencia())
            return -1;
        else if (o1.getFrecuencia() > o2.getFrecuencia())
            return 1;
        else
            return 0;
    }
    
}
