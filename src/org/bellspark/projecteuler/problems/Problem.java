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
public abstract class Problem {
    private long answer;
    
    public long getAnswer() {
        return this.answer;
    }
    
    public long giveAnswer() {
        solveProblem();
        return this.answer;
    }
    
    public void setAnswer(long anAnswer) {
        this.answer = anAnswer;
    }
    
    abstract void solveProblem();
}
