/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josue
 * @param <K>
 * @param <V>
 */
public class Arbol<K,V>{
    
    private Nodo<K,V> root;

    /**
     *
     */
    public Arbol() {
    }

    /**
     *
     * @param root
     */
    public void setRoot(Nodo<K, V> root) {
        this.root = root;
    }

    /**
     *
     * @return
     */
    public Nodo<K, V> getRoot() {
        return root;
    }
    
}
