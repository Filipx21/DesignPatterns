package observer.exercise2.order.observable;

import observer.exercise2.notification.observer.Observer;

public interface Observable {

    void registerObserver(Observer... observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}
