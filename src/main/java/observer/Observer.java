package observer;

import observer.notification.Email;
import observer.notification.MobileApp;
import observer.notification.TextMessage;
import observer.order.Order;
import observer.order.OrderStatus;

public class Observer {

    public void start(){
        Order order = new Order(123L, OrderStatus.ZAREJESTROWANE);
        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        textMessage.ubdateOrderStatus(order);
        mobileApp.ubdateOrderStatus(order);
        email.ubdateOrderStatus(order);

    }

}
