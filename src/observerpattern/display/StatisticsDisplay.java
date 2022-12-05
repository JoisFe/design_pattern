package observerpattern.display;

import observerpattern.observer.Observer;
import observerpattern.subject.WeatherData;

/**
 * @author : 조재철
 * @since 1.0
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (this.tempSum / this.numReadings)
            + "/" + this.maxTemp + "/" + this.minTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.tempSum += temp;
        ++this.numReadings;

        if (temp > this.maxTemp) {
            this.maxTemp = temp;
        }

        if (temp < this.minTemp) {
            this.minTemp = temp;
        }

        this.display();
    }
}
