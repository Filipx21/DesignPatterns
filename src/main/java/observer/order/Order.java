package observer.order;

public class Order {

    private Long orderNr;
    private OrderStatus orderStatus;

    public Order(Long orderNr, OrderStatus orderStatus) {
        this.orderNr = orderNr;
        this.orderStatus = orderStatus;
    }

    public Long getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(Long orderNr) {
        this.orderNr = orderNr;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

}
