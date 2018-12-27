package project.euler;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import org.bellspark.projecteuler.problems.*;

/**
 * This class relays the answer between problem objects and the main window. It
 * will handle spinning of a problem, allowing it to finish, and will inform the
 * main window of a change.
 *
 * @author Paul
 */
public class Controller implements Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    public static final int PROBLEMS_SOLVED = 5;
    private boolean[] solving = null;
    Problem problem = null;

    public Controller() {
        solving = new boolean[PROBLEMS_SOLVED];
    }

    public void answerQuestion(int problemNumber) {
        problem = null;

        switch (problemNumber) {
            case 1:
                problem = new Problem1();
                break;
            case 2:
                problem = new Problem2();
                break;
            case 3:
                problem = new Problem3();
                break;
            case 4:
                problem = new Problem4();
                break;
            case 5:
                problem = new Problem5();
                break;
        }
        /*
        new Thread(() -> {
         runProblemSolver(problemNumber, problem);
        }).start();
         */
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {
                runProblemSolver(problemNumber, problem);
            }
        });
    }

    private void runProblemSolver(int problemNumber, Problem problem) {
        notifyObservers(problemNumber, problem.giveAnswer());
    }

    @Override
    public void registerObserver(Observer anObserver) {
        observers.add(anObserver);
    }

    @Override
    public void removeObserver(Observer anObserver) {
        int index = observers.indexOf(anObserver);

        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers(int problemNumber, long answer) {
        for (Observer e : observers) {
            e.update(problemNumber, answer);
        }
    }

}
