package builder.classical_builder.classical_builder_airport;

import java.math.BigDecimal;

public class MiddleFlight implements AirLineBuilder {

    private AirLine airLine;

    public MiddleFlight() {
        airLine = new AirLine();
    }

    @Override
    public void buildFrom() {
        this.airLine.from = "Tokyo";
    }

    @Override
    public void buildTo() {
        this.airLine.to = "Warszawa";
    }

    @Override
    public void buildDistance() {
        this.airLine.distance = 3244.32;
    }

    @Override
    public void buildPrice() {
        this.airLine.price = new BigDecimal(4222.44);
    }

    @Override
    public void buildDelayed() {
        this.airLine.delayed = false;
    }

    @Override
    public void buildMaxPassengers() {
        this.airLine.maxPassengers = 50;
    }

    @Override
    public AirLine getAirLine() {
        return airLine;
    }

}
