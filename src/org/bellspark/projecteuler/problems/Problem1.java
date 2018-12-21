/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bellspark.projecteuler.problems;

/**
 *
 * @author Paul
 */
public class Problem1 extends Problem {
    
    @Override
    public long giveAnswer() {
        solveProblem();
        return super.getAnswer();
    }
    
    /**
     * This method calculates and returns the sum all of the numbers between 
     * 0 and the number supplied exclusive which are multiples of integers 3
     * and 5.
     * 
     * @param cap The number to stop testing exclusive.
     * @return The sum of the multiples of three and five between 0 and the number
     * supplied exclusive.
     */
     private long getMultipleOfThreeAndFive(int cap) {
        long sum = 0L;
        
        for (int i = 0; i < cap; i++) {
            if(i % 3 == 0 | i % 5 == 0)
                sum += i;
        }
        
        return sum;
    }
    
    @Override
     void solveProblem() {
        super.setAnswer(getMultipleOfThreeAndFive(1000));
    }
}
