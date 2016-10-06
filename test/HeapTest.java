/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.PriorityQueue;
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
public class HeapTest {
    
    public HeapTest() {
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
     * Test of setNodos method, of class Heap.
     */
    @Test
    public void testSetNodos() {
        System.out.println("setNodos");
        PriorityQueue<Nodo<Integer, Character>> nodos = null;
        Heap instance = new Heap();
        instance.setNodos(nodos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNodos method, of class Heap.
     */
    @Test
    public void testGetNodos() {
        System.out.println("getNodos");
        Heap instance = new Heap();
        PriorityQueue<Nodo<Integer, Character>> expResult = null;
        PriorityQueue<Nodo<Integer, Character>> result = instance.getNodos();
        result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
