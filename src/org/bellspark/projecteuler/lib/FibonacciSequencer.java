/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bellspark.projecteuler.lib;

import java.util.ArrayList;

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
    
    /**
     * Returns an array of the values of the Fibonacci sequence under a specific
     * ceiling.
     * @param ceiling 
     * @return 
     */
    public static long[] getFibSequenceUnderCeiling(long ceiling) {
        ArrayList<Long> arr = new ArrayList<Long>();
        int a = 0;
        int b = 1;
        
        while(a < ceiling) {
            b = a + b;
            a = b - a;
            
            arr.add((long)a);
        }

        long[] reg_arr = new long[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            reg_arr[i] = arr.get(i);
        }
        
        return reg_arr;
    }
}
