package observerpattern.subject;

import observerpattern.observer.Observer;

/**
 * @author : 조재철
 * @since 1.0
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
