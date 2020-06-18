package observer.observer_exercise.weather;

import observer.observer_exercise.infrastructure.ObservableWeather;
import observer.observer_exercise.infrastructure.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements ObservableWeather {

    private int temperature;
    private int pressure;
    private Set<Observer> observers;

    public WeatherForecast() { }

    public WeatherForecast(int temperature, int pressure) {
        this.observers = new HashSet<Observer>();
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.updateWeatherForecast(this);
        }
    }

    public void updateWeather(int temperature, int pressure){
        this.setTemperature(temperature);
        this.setPressure(pressure);
        this.notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    private void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    private void setPressure(int pressure) {
        this.pressure = pressure;
    }

}
