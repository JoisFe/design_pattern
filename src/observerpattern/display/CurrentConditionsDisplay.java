package observerpattern.display;

import observerpattern.observer.Observer;
import observerpattern.subject.WeatherData;

/**
 * @author : 조재철
 * @since 1.0
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도 " + this.temperature + "F, 습도 " + this.humidity + "%");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.display();
    }
}
