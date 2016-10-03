/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josue
 */
public class NodoTest {
    
    public NodoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setDerecho method, of class Nodo.
     */
    @Test
    public void testSetDerecho() {
        System.out.println("setDerecho");
        Nodo instance = new Nodo();
        instance.setDerecho(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDerecho method, of class Nodo.
     */
    @Test
    public void testGetDerecho() {
        System.out.println("getDerecho");
        Nodo instance = new Nodo();
        Nodo expResult = null;
        Nodo result = instance.getDerecho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrecuencia method, of class Nodo.
     */
    @Test
    public void testSetFrecuencia() {
        System.out.println("setFrecuencia");
        Object frecuencia = null;
        Nodo instance = new Nodo();
        instance.setFrecuencia(frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuencia method, of class Nodo.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        Nodo instance = new Nodo();
        Object expResult = null;
        Object result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIzquierdo method, of class Nodo.
     */
    @Test
    public void testSetIzquierdo() {
        System.out.println("setIzquierdo");
        Nodo instance = new Nodo();
        instance.setIzquierdo(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIzquierdo method, of class Nodo.
     */
    @Test
    public void testGetIzquierdo() {
        System.out.println("getIzquierdo");
        Nodo instance = new Nodo();
        Nodo expResult = null;
        Nodo result = instance.getIzquierdo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Nodo.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        Object valor = null;
        Nodo instance = new Nodo();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Nodo.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Nodo instance = new Nodo();
        Object expResult = null;
        Object result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
