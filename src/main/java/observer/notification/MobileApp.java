package observer.notification;

import observer.order.Order;

public class MobileApp implements Observer {

    public void ubdate(Order order) {
        System.out.println("MobileApp - Zamówienie numer: " + order.getOrderNr() + ", zmieniło status na: " + order.getOrderStatus());
    }

}
