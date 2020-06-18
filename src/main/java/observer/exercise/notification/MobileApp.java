package observer.exercise.notification;

import observer.exercise.order.Order;

public class MobileApp implements Observer {

    public void update(Order order) {
        System.out.println("MobileApp - Zamówienie numer: " + order.getOrderNr() + ", zmieniło status na: " + order.getOrderStatus());
    }

}
