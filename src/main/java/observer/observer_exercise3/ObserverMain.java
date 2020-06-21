package observer.observer_exercise3;

import observer.observer_exercise3.notification.Email;
import observer.observer_exercise3.notification.MobileApp;
import observer.observer_exercise3.notification.TextMessage;
import observer.observer_exercise3.order.Order;
import observer.observer_exercise3.order.OrderStatus;

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
