/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bellspark.projecteuler.lib;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author pmoli004
 */
public class Euler {
    /**
     * Reverses a number based on the base which is provided.
     * @param base number base.
     * @param num number to be reversed.
     * @return reversed number.
     */
    public static long reverseNumber(long base, long num) {
        LinkedList<Long> numStack = new LinkedList<Long>();
        int exponent = 0;
        long reversedNumber = 0;
        
        while(num != 0) {
            numStack.add(num % base);
            num /= base;
            exponent++;
        }
        
        while(!numStack.isEmpty()) {
            exponent--;
            reversedNumber += numStack.pop() * Math.pow(base, exponent);
        }
        
        return reversedNumber;
    }
    
}
