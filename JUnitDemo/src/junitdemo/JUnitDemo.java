/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitdemo;

/**
 *
 * @author amitoshseu
 */
public class JUnitDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int result =c.add(3,5);
        System.out.println("Result of addition 3 and 5 = " + result);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Add another line");
    }
    
}
