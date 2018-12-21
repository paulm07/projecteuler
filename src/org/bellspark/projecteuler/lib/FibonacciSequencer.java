/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bellspark.projecteuler.lib;

/**
 *
 * @author Paul
 */
public class FibonacciSequencer {
    public static long getFibTerm(int term) {
        int a = 0;
        int b = 1;
        
        for (int i = 0; i <= term; i++) {
          b = a + b;
          a = b - a;
        }
        
        return a;
    }
}
