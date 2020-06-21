package builder.classical_builder.classical_builder_airport;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
public class AirLine {

    @Getter @Setter public String from;
    @Getter @Setter public String to;
    @Getter @Setter public double distance;
    @Getter @Setter public BigDecimal price;
    @Getter @Setter public boolean delayed;
    @Getter @Setter public int maxPassengers;

}
