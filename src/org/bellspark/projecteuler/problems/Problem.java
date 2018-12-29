package org.bellspark.projecteuler.problems;

/**
 *
 * @author Paul
 */
public abstract class Problem {
    private long answer = 0;
    private int problemNumber = 0;
    
    public void computeAnswer() {
        solveProblem();
    }
    
    public long getAnswer() {
        return this.answer;
    }
    
    public int getProblemNumber() {
        return this.problemNumber;
    }
    
    public void setAnswer(long anAnswer) {
        this.answer = anAnswer;
    }
    
    public void setProblemNumber(int aProblemNumber) {
        this.problemNumber = aProblemNumber;
    }
    
    abstract void solveProblem();
}
