package builder.classical_builder.classical_builder_airport;

import lombok.AllArgsConstructor;

public class AirLineDirector {

    private AirLineBuilder airLineBuilder;

    public AirLineDirector(AirLineBuilder airLineBuilder) {
        this.airLineBuilder = airLineBuilder;
    }

    public void buildAirLine() {
        airLineBuilder.buildFrom();
        airLineBuilder.buildTo();
        airLineBuilder.buildDistance();
        airLineBuilder.buildPrice();
        airLineBuilder.buildDelayed();
        airLineBuilder.buildMaxPassengers();
    }

    public AirLine getAirLine() {
        return airLineBuilder.getAirLine();
    }


}
