package project.euler;

/**
 *
 * @author pmoli004
 */
public interface Subject {
    public void registerObserver();
    public void removeObserver();
    public void notifyObserver();
}
