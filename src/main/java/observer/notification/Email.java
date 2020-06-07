package observer.notification;

import observer.order.Order;

public class Email implements Observer {

    public void update(Order order) {
        System.out.println("Email - Zamówienie numer: " + order.getOrderNr() + ", zmieniło status na: " + order.getOrderStatus());
    }

}
