package observerpattern.observer;

/**
 * @author : 조재철
 * @since 1.0
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);
    // 풀 방식
    // void update();
}
