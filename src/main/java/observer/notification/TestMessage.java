package observer.notification;

import observer.order.Order;

public class TestMessage {

    public void ubdateOrderStatus(Order order){
        System.out.println("SMS - Zamówienie numer: " + order.getOrderNr() + ", zmieniło status na: " + order.getOrderStatus());
    }

}
