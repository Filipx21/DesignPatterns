package observer.notification;

import observer.order.Order;

public class TextMessage implements Observer {

    public void update(Order order) {
        System.out.println("SMS - Zamówienie numer: " + order.getOrderNr() + ", zmieniło status na: " + order.getOrderStatus());
    }

}
