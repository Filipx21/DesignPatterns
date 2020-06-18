package observer.exercise.order;

import observer.exercise.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable{

    private Long orderNr;
    private OrderStatus orderStatus;
    private Set<Observer> registerObserver = new HashSet<Observer>();

    public Order(Long orderNr, OrderStatus orderStatus) {
        this.orderNr = orderNr;
        this.orderStatus = orderStatus;
    }

    public void registerObserver(Observer observer) {
        registerObserver.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        registerObserver.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer : registerObserver){
            observer.update(this);
        }
    }

    public void changeOrderStatus(OrderStatus orderStatus) {
        setOrderStatus(orderStatus);
        notifyObservers();
    }





    public Long getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(Long orderNr) {
        this.orderNr = orderNr;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

}
