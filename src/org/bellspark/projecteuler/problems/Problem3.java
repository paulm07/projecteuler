package org.bellspark.projecteuler.problems;

import org.bellspark.projecteuler.lib.PrimeFactorizer;

/**
 * This class was created to solve Problem 3 of Project Euler which
 * asks for the largest prime factor of 600851475143.
 * @author Paul
 */
public class Problem3 extends Problem {
    
    public Problem3() {
        super.setProblemNumber(3);
    }
    
    private long getLargestIndexValue(long[] arr) {
        return arr[arr.length - 1];
    }
    
    @Override
    void solveProblem() {
        long temp = getLargestIndexValue(PrimeFactorizer.getPrimeFactors(600851475143L));
        super.setAnswer(temp);
    }
    
}
