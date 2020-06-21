package observer.observer_exercise3.notification;

import observer.observer_exercise3.order.Order;

public class Email implements Observer {

    public void update(Order order) {
        System.out.println("Email - Zamówienie numer: " + order.getOrderNr() + ", zmieniło status na: " + order.getOrderStatus());
    }

}
