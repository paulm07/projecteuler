/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bellspark.projecteuler.problems;

import org.bellspark.projecteuler.lib.PrimeFactorizer;

/**
 *
 * @author Paul
 */
public class Problem3 extends Problem {
    
    private long getLargestIndexValue(long[] arr) {
        return arr[arr.length - 1];
    }
    
    @Override
    void solveProblem() {
        long temp = getLargestIndexValue(PrimeFactorizer.primeFactors(600851475143L));
        super.setAnswer(temp);
    }
    
}
