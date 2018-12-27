package project.euler;

/**
 *
 * @author pmoli004
 */
public interface Subject {
    public void registerObserver(Observer anObserver);
    public void removeObserver(Observer anObserver);
    public void notifyObservers(int problemNumber, long answer);
}
