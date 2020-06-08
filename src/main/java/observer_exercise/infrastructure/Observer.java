package observer_exercise.infrastructure;

import observer_exercise.weather.WeatherForecast;

public interface Observer {

    void updateWeatherForecast(WeatherForecast weatherForecast);

}
