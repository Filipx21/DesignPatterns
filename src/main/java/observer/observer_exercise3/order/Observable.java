package observer.observer_exercise3.order;

import observer.observer_exercise3.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();

}
