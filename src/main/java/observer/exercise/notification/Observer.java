package observer.exercise.notification;

import observer.exercise.order.Order;

public interface Observer {

    void update(Order order);

}
