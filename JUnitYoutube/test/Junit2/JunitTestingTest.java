/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amitoshseu
 */
public class JunitTestingTest {
    
    public JunitTestingTest() {
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
     * Test of square method, of class JunitTesting.
     */
    @Test
    public void testSquare() {
       JunitTesting test = new JunitTesting();
       int output = test.square(5);
       assertEquals(25,output);
    }

    
    @Test
    public void testCountA() {
        JunitTesting test = new JunitTesting();
        int output = test.countA("javabean");
        assertEquals(3,output);
        
    }
    
}
