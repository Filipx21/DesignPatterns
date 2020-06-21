package observer.observer_exercise2.order;

import observer.observer_exercise2.notification.observer.Observer;
import observer.observer_exercise2.order.observable.Observable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {

    private Long id;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObserver = new HashSet<Observer>();

    public Order() {
    }

    public Order(Long id, OrderStatus orderStatus) {
        this.id = id;
        this.orderStatus = orderStatus;
    }

    public void registerObserver(Observer... observer) {
        registeredObserver.addAll(Arrays.asList(observer));
    }

    public void unregisterObserver(Observer observer) {
        registeredObserver.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer : registeredObserver){
            observer.notify(this);
        }
    }

    public void updateOrderStatus(OrderStatus orderStatus) {
        setOrderStatus(orderStatus);
        this.notifyObservers();
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getId() {
        return id;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

}
