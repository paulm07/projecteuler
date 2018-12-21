package org.bellspark.projecteuler.lib;

import java.util.ArrayList;

/**
 *
 * @author Paul
 */
public class PrimeFactorizer {
    public static long[] primeFactors(long n) {
        ArrayList<Long> primeFactorsArrList = new ArrayList<Long>();
        
        // Will add the # of 2's that divide n
        while(n % 2 == 0) {
            primeFactorsArrList.add(2L);
            n /= 2;
        }
        
        for (long i = 3; i <= Math.sqrt(n); i+= 2) {
            while(n % i == 0) {
                primeFactorsArrList.add(i);
                n /= i;
            }
        }
        
        if(n > 2) {
            primeFactorsArrList.add(n);
        }
        
        long[] reg_arr = new long[primeFactorsArrList.size()];
        
        for (int i = 0; i < reg_arr.length; i++) {
            reg_arr[i] = primeFactorsArrList.get(i);
        }
        
        return reg_arr;
    }
    
}
