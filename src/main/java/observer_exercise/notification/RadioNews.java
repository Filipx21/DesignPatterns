package observer_exercise.notification;

import observer_exercise.infrastructure.Observer;
import observer_exercise.weather.WeatherForecast;

public class RadioNews implements Observer {

    public void updateWeatherForecast(WeatherForecast weatherForecast) {
        System.out.printf("[%s]Temperature = %d, Pressure = %d\n", "Radio", weatherForecast.getTemperature(), weatherForecast.getPressure());
    }

}
