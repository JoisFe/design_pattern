package observerpattern.display;

import observerpattern.observer.Observer;
import observerpattern.subject.WeatherData;

/**
 * @author : 조재철
 * @since 1.0
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (this.currentPressure > this.lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (this.currentPressure == this.lastPressure) {
            System.out.println("More of the same");
        } else if (this.currentPressure < this.lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.lastPressure = currentPressure;
        this.currentPressure = pressure;

        this.display();
    }
}
