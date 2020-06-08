package observer;

import observer.notification.Email;
import observer.notification.MobileApp;
import observer.notification.TextMessage;
import observer.order.Order;
import observer.order.OrderStatus;

public class ObserverMain {

    public void start(){

        Order order = new Order(123L, OrderStatus.ZAREJESTROWANE);
        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println("------------------------------");

        order.changeOrderStatus(OrderStatus.WYSLANE);

        order.unregisterObserver(email);

        System.out.println("------------------------------");

        order.changeOrderStatus(OrderStatus.ODEBRANE);


    }

}
