package builder.classical_builder.classical_builder_airport;

public interface AirLineBuilder {

    void buildFrom();
    void buildTo();
    void buildDistance();
    void buildPrice();
    void buildDelayed();
    void buildMaxPassengers();
    AirLine getAirLine();

}
