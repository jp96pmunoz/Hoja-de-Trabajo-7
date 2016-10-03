
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josue
 */
public class NodeComparator implements Comparator<Nodo<Integer, Character>> {

    @Override
    public int compare(Nodo<Integer, Character> o1, Nodo<Integer, Character> o2) {
        if (o1.getFrecuencia() < o2.getFrecuencia())
            return -1;
        else if (o1.getFrecuencia() > o2.getFrecuencia())
            return 1;
        else
            return 0;
    }
    
}
