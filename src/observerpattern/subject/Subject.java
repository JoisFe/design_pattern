package observerpattern.subject;

import observerpattern.observer.Observer;

/**
 * @author : 조재철
 * @since 1.0
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
