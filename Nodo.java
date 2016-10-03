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
public class Nodo<K,V> {
    
    private K frecuencia;
    private V valor;
    private Nodo<K,V> izquierdo;
    private Nodo<K,V> derecho;

    /**
     *
     */
    public Nodo() {
    }

    /**
     *
     * @param frecuencia
     * @param valor
     * @param izquierdo
     * @param derecho
     */
    public Nodo(K frecuencia, V valor, Nodo<K, V> izquierdo, Nodo<K, V> derecho) {
        this.frecuencia = frecuencia;
        this.valor = valor;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }
    
    /**
     *
     * @param node
     */
    public Nodo(Nodo node){
        frecuencia = (K) node.getFrecuencia();
        valor = (V) node.getValor();
        izquierdo = node.getIzquierdo();
        derecho = node.getDerecho();
    }

    /**
     *
     * @param derecho
     */
    public void setDerecho(Nodo<K, V> derecho) {
        this.derecho = derecho;
    }

    /**
     *
     * @return
     */
    public Nodo<K, V> getDerecho() {
        return derecho;
    }

    /**
     *
     * @param frecuencia
     */
    public void setFrecuencia(K frecuencia) {
        this.frecuencia = frecuencia;
    }

    /**
     *
     * @return
     */
    public K getFrecuencia() {
        return frecuencia;
    }

    /**
     *
     * @param izquierdo
     */
    public void setIzquierdo(Nodo<K, V> izquierdo) {
        this.izquierdo = izquierdo;
    }

    /**
     *
     * @return
     */
    public Nodo<K, V> getIzquierdo() {
        return izquierdo;
    }

    /**
     *
     * @param valor
     */
    public void setValor(V valor) {
        this.valor = valor;
    }

    /**
     *
     * @return
     */
    public V getValor() {
        return valor;
    }
    
    
}
