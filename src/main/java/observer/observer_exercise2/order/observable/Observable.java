package observer.observer_exercise2.order.observable;

import observer.observer_exercise2.notification.observer.Observer;

public interface Observable {

    void registerObserver(Observer... observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}
