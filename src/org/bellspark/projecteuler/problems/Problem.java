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
        return getAnswer();
    }
    
    public void setAnswer(long anAnswer) {
        this.answer = anAnswer;
    }
    
    abstract void solveProblem();
}
