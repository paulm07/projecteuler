package org.bellspark.projecteuler.lib;

import java.util.ArrayList;

/**
 * 
 * @author pmoli004
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
        
        for (int i = 0; i < arr.size(); i++) {
            reg_arr[i] = arr.get(i);
        }
        
        return reg_arr;
    }
}
