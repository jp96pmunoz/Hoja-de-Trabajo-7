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
public class HuffmanTest {
    
    public HuffmanTest() {
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
     * Test of setFrecuencias method, of class Huffman.
     */
    @Test
    public void testSetFrecuencias() {
        System.out.println("setFrecuencias");
        String cadena = "";
        Huffman instance = new Huffman();
        instance.setFrecuencias(cadena);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNodos method, of class Huffman.
     */
    @Test
    public void testSetNodos() {
        System.out.println("setNodos");
        Huffman instance = new Huffman();
        instance.setNodos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTree method, of class Huffman.
     */
    @Test
    public void testSetTree() {
        System.out.println("setTree");
        Huffman instance = new Huffman();
        instance.setTree();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTable method, of class Huffman.
     */
    @Test
    public void testPrintTable() {
        System.out.println("printTable");
        Nodo<Integer, Character> nodo = null;
        String codigo = "";
        Huffman instance = new Huffman();
        instance.printTable(nodo, codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decode method, of class Huffman.
     */
    @Test
    public void testDecode() {
        System.out.println("decode");
        String mensaje = "";
        Nodo<Integer, Character> node = null;
        Huffman instance = new Huffman();
        instance.decode(mensaje, node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDecodificado method, of class Huffman.
     */
    @Test
    public void testGetDecodificado() {
        System.out.println("getDecodificado");
        Huffman instance = new Huffman();
        String expResult = "";
        String result = instance.getDecodificado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTree method, of class Huffman.
     */
    @Test
    public void testGetTree() {
        System.out.println("getTree");
        Huffman instance = new Huffman();
        Arbol<Integer, Character> expResult = null;
        Arbol<Integer, Character> result = instance.getTree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
