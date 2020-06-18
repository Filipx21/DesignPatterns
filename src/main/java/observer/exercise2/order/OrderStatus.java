package observer.exercise2.order;

public enum OrderStatus {

    ZAMOWIONE("Zamówione"),
    PAKOWANIE("Pakowanie"),
    WYSLANE("Wysłane"),
    DOSTARCZONE("Dostarczona");

    private final String typeOfStatus;

    OrderStatus(String typeOfStatus) {
        this.typeOfStatus = typeOfStatus;
    }

    @Override
    public String toString() {
        return this.typeOfStatus;
    }
}
