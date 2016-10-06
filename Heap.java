
import java.util.PriorityQueue;

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
public class Heap {
    
    private PriorityQueue<Nodo<Integer, Character>> nodos;

    /**
     *
     */
    public Heap() {
        nodos = new PriorityQueue(new NodeComparator());
    }

    /**
     *
     * @param nodos
     */
    public void setNodos(PriorityQueue<Nodo<Integer, Character>> nodos) {
        this.nodos = nodos;
    }

    /**
     *
     * @return
     */
    public PriorityQueue<Nodo<Integer, Character>> getNodos() {
        return nodos;
    }
    
}
