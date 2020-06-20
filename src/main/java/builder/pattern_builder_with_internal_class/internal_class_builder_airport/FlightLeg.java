package builder.pattern_builder_with_internal_class.internal_class_builder_airport;

import java.math.BigDecimal;

public class FlightLeg {

    private final String from;
    private final String to;
    private boolean delayed;
    private BigDecimal price;

    private FlightLeg(FlightLegBuilder flightLegBuilder){
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.delayed = flightLegBuilder.delayed;
        this.price = flightLegBuilder.price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public boolean getDelayed() {
        return delayed;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed='" + delayed + '\'' +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder {

        private String from;
        private String to;
        private boolean delayed;
        private BigDecimal price;

        public FlightLegBuilder() {}

        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public FlightLegBuilder buildFrom(String from) {
            this.from = from;
            return this;
        }

        public FlightLegBuilder buildTo(String to) {
            this.to = to;
            return this;
        }

        public FlightLegBuilder buildDelayed(boolean delayed) {
            this.delayed = delayed;
            return this;
        }

        public FlightLegBuilder buildPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public FlightLeg build() {
            if(this.price == null) {
                throw new IllegalStateException("Brak wymaganego pola - cena");
            }
            return new FlightLeg(this);
        }
    }

}
