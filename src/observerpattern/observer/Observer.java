package observerpattern.observer;

/**
 * @author : 조재철
 * @since 1.0
 */
public interface Observer {

    public void update(float temp, float humidity, float pressure);
}
