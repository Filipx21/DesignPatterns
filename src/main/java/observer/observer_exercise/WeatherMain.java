package observer.observer_exercise;

import observer.observer_exercise.notification.InternetNews;
import observer.observer_exercise.notification.RadioNews;
import observer.observer_exercise.notification.TvNews;
import observer.observer_exercise.weather.WeatherForecast;

public class WeatherMain {

    public void weatherMain() {
        WeatherForecast weather = new WeatherForecast(12, 23);
        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();
        TvNews tvNews = new TvNews();

        weather.registerObserver(internetNews);
        weather.registerObserver(radioNews);
        weather.registerObserver(tvNews);

        weather.notifyObservers();

        weather.unregisterObserver(radioNews);
        weather.unregisterObserver(tvNews);

        weather.updateWeather(44, 22);

        weather.registerObserver(tvNews);

        System.out.println("Nowa prognoza pogody");
        weather.updateWeather(32, 55);
    }
}
