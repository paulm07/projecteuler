/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bellspark.projecteuler.problems;

import org.bellspark.projecteuler.lib.Euler;

/**
 *
 * @author Paul
 */
public class Problem4 extends Problem{

    public Problem4() {
        super.setProblemNumber(4);
    }
    public long findLargestPalindromeInRange(long low, long high) {
        long largestPalindrome = 0;
        
        
        for (long i = low; i <= high; i++) {
            for (long j = low; j <= high; j++) {
                if((i * j) == Euler.reverseNumber(10, i * j))
                    largestPalindrome = i * j;
            }
        }
        return largestPalindrome;
    }
    
    @Override
    void solveProblem() {
        long temp = findLargestPalindromeInRange(100, 999);
        super.setAnswer(temp);
    }
    
}
