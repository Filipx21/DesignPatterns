package factory.factory_exercise_car_service;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Audi extends Car {

    @Getter private String model;

    private Audi(AudiBuilder audiBuilder) {
        super(
                audiBuilder.carType,
                audiBuilder.name,
                audiBuilder.capacity,
                audiBuilder.price,
                audiBuilder.dateOfProduction
        );
        this.model = audiBuilder.model;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", model = '" + this.model + "'}";
     }

    public static class AudiBuilder {

        private CarType carType;
        private String name;
        private double capacity;
        private BigDecimal price;
        private LocalDate dateOfProduction;
        private String model;

        public AudiBuilder buildCarType(CarType carType) {
            this.carType = carType;
            return this;
        }

        public AudiBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        public AudiBuilder buildCapacity(double capacity) {
            this.capacity = capacity;
            return this;
        }

        public AudiBuilder buildPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public AudiBuilder buildDateOfProduction(LocalDate dateOfProduction) {
            this.dateOfProduction = dateOfProduction;
            return this;
        }

        public AudiBuilder buildModel(String model) {
            this.model = model;
            return this;
        }

        public Audi build() {
            return new Audi(this);
        }

    }

}
