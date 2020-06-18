package observer.observer_exercise.notification;

import observer.observer_exercise.infrastructure.Observer;
import observer.observer_exercise.weather.WeatherForecast;

public class RadioNews implements Observer {

    public void updateWeatherForecast(WeatherForecast weatherForecast) {
        System.out.printf("[%s]Temperature = %d, Pressure = %d\n", "Radio", weatherForecast.getTemperature(), weatherForecast.getPressure());
    }

}
