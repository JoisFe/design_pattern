package observerpattern.weather;

import observerpattern.display.CurrentConditionsDisplay;
import observerpattern.display.ForecastDisplay;
import observerpattern.display.StatisticsDisplay;
import observerpattern.subject.WeatherData;

/**
 * @author : 조재철
 * @since 1.0
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 39.2f);
    }
}
