package observer.notification;

import observer.order.Order;

public class Email {

    public void ubdateOrderStatus(Order order){
        System.out.println("Email - Zamówienie numer: " + order.getOrderNr() + ", zmieniło status na: " + order.getOrderStatus());
    }

}
