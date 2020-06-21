package observer.observer_exercise2.notification;


import observer.observer_exercise2.notification.observer.Observer;
import observer.observer_exercise2.order.Order;

public class App implements Observer {

    public void notify(Order order) {
        System.out.println(this.getClass().getName() + ": Zamówienie o nr " + order.getId() + ", otrzymalo status: " + order.getOrderStatus());
    }

}
