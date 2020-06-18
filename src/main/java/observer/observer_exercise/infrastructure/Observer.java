package observer.observer_exercise.infrastructure;

import observer.observer_exercise.weather.WeatherForecast;

public interface Observer {

    void updateWeatherForecast(WeatherForecast weatherForecast);

}
