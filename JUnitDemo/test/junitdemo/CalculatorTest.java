/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author amitoshseu
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 10;
        int b = 20;
        Calculator instance = new Calculator();
        int expResult = 30;
        int result = instance.add(a, b);
        Assert.assertEquals(expResult, result);//A static method of Assert Class
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testBoundaryCase(){
        int a = Integer.MAX_VALUE;
        int b = 1; 
        long expectedResult = 2147483648l;
        long calculatedResult= new Calculator().add(a, b);
        Assert.assertEquals(expectedResult,calculatedResult);
        
    }
    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int a = 10;
        int b = 20;
        Calculator instance = new Calculator();
        int expResult = -10;
        int result = instance.subtract(a, b);
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
