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
    public static long reverseNumber(long num) {
        LinkedList<Long> numStack = new LinkedList<Long>();
        int exponent = 0;
        long reversedNumber = 0;
        
        while(num != 0) {
            numStack.add(num % 10);
            num /= 10;
            exponent++;
        }
        
        while(!numStack.isEmpty()) {
            exponent--;
            reversedNumber += numStack.pop() * Math.pow(10, exponent);
        }
        
        return reversedNumber;
    }
}
