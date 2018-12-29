package org.bellspark.projecteuler.problems;

import org.bellspark.projecteuler.lib.FibonacciSequencer;

/**
 * This class solves Problem 2 of Project Euler which asks for the sum
 * of all even Fibonacci terms under 4,000,000.
 * @author Paul
 */
public class Problem2 extends Problem {
    
    public Problem2() {
        super.setProblemNumber(2);
    }
    
    private long getSumOfEvenValues(long arr[]) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                sum += arr[i];
        }
        
        return sum;
    }
    
    private long getSumOfEvenValuesWithFibonacciCeiling(long ceiling) {
        long[] temp = FibonacciSequencer.getFibSequenceUnderCeiling(ceiling);
        
        return getSumOfEvenValues(temp);
    }
    
    @Override
    void solveProblem() {
         super.setAnswer(getSumOfEvenValuesWithFibonacciCeiling(4_000_000));
    }
    
}
