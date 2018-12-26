package org.bellspark.projecteuler.lib;

import java.util.ArrayList;

/**
 * This class contains methods to compute terms of the Fibonacci sequence. Specifically,
 * the sequence in which the sum of two numbers is added to the largest of of the arguments
 * which created it in infinite fashion.
 * @author Paul
 */
public class FibonacciSequencer {
    public static long getFibTerm(int term) {
        long a = 0L;
        long b = 1L;
        
        for (long i = 0L; i <= term; i++) {
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
        long a = 0L;
        long b = 1L;
        
        while(a < ceiling) {
            b = a + b;
            a = b - a;
            
            arr.add(a);
        }

        long[] reg_arr = new long[arr.size()];
        
        for (long i = 0L; i < arr.size(); i++) {
            reg_arr[i] = arr.get(i);
        }
        
        return reg_arr;
    }
}
