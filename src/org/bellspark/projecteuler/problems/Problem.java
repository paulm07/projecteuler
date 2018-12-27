package org.bellspark.projecteuler.problems;

/**
 *
 * @author Paul
 */
public abstract class Problem {
    private long answer;
    
    public long giveAnswer() {
        solveProblem();
        return this.answer;
    }
    
    public void setAnswer(long anAnswer) {
        this.answer = anAnswer;
    }
    
    abstract void solveProblem();
}
