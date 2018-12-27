package org.bellspark.projecteuler.problems;

/**
 *
 * @author Paul
 */
public class Problem1 extends Problem {
    
    /**
     * This method calculates and returns the sum all of the numbers between 
     * 0 and the number supplied exclusive which are multiples of integers 3
     * and 5.
     * 
     * @param cap The number to stop testing exclusive.
     * @return The sum of the multiples of three and five between 0 and the number
     * supplied exclusive.
     */
     private long getMultipleOfThreeAndFiveSum(int cap) {
        long sum = 0L;
        
        for (int i = 0; i < cap; i++) {
            if(i % 3 == 0 | i % 5 == 0)
                sum += i;
        }
        
        return sum;
    }
    
    @Override
     void solveProblem() {
        long temp = getMultipleOfThreeAndFiveSum(1000);
        super.setAnswer(temp);
    }
}
