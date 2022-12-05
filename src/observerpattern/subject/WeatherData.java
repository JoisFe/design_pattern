package observerpattern.subject;

import java.util.ArrayList;
import java.util.List;
import observerpattern.observer.Observer;

/**
 * @author : 조재철
 * @since 1.0
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        this.measurementsChanged();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.temperature, this.humidity, this.pressure);
            // 풀 방식
            // observer.update();
        }
    }

    public void measurementsChanged() {
        this.notifyObservers();
    }
}
