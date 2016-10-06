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
public class NodeComparatorTest {
    
    public NodeComparatorTest() {
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
     * Test of compare method, of class NodeComparator.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Nodo<Integer, Character> o1 = new Nodo(15,'h',null,null);
        Nodo<Integer, Character> o2 = new Nodo(12,'e',null,null);
        NodeComparator instance = new NodeComparator();
        int expResult = 1;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
