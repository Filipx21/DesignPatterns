package observer.notification;

import observer.order.Order;

public class MobileApp {

    public void ubdateOrderStatus(Order order){
        System.out.println("MobileApp - Zamówienie numer: " + order.getOrderNr() + ", zmieniło status na: " + order.getOrderStatus());
    }

}
