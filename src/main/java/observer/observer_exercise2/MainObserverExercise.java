package observer.observer_exercise2;

import observer.observer_exercise2.notification.App;
import observer.observer_exercise2.notification.Email;
import observer.observer_exercise2.notification.Sms;
import observer.observer_exercise2.order.Order;
import observer.observer_exercise2.order.OrderStatus;

import org.apache.commons.lang3.time.StopWatch;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class MainObserverExercise {

    private static MainObserverExercise instance;
    private App app;
    private Email email;
    private Sms sms;
    private StopWatch stopWatch = new StopWatch();

    private MainObserverExercise() {
        app = new App();
        email = new Email();
        sms = new Sms();
    }

    public void run() {
        try {
            stopWatch.start();
            Order order = new Order(22L, OrderStatus.ZAMOWIONE);
            order.registerObserver(app, email, sms);
            order.notifyObservers();
            List<OrderStatus> statuses = Arrays.asList(OrderStatus.values());
            statuses.forEach(status -> {
                        try {
                            sleep(1000);
                            if (status != OrderStatus.ZAMOWIONE) {
                                order.updateOrderStatus(status);
                            } else {
                                order.unregisterObserver(sms);
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            );
            System.out.printf("Time: %d nano, %d ms\n",
                    stopWatch.getNanoTime(),
                    stopWatch.getTime(TimeUnit.MILLISECONDS));
        } catch (IllegalStateException ex) {
            ex.printStackTrace();
        }

    }

    public static MainObserverExercise getInstance() {
        if (instance == null) {
            synchronized (MainObserverExercise.class) {
                if (instance == null) {
                    instance = new MainObserverExercise();
                }
            }
        }
        return instance;
    }
}
