package observer.observer_exercise.infrastructure;

public interface ObservableWeather {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();

}
