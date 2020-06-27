package factory.factory_exercise_car_service;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Car {

    @Getter private CarType carType;
    @Getter private String name;
    @Getter private double capacity;
    @Getter private BigDecimal price;
    @Getter private LocalDate dateOfProduction;

    protected Car(CarType carType, String name, double capacity, BigDecimal price, LocalDate dateOfProduction) {
        this.carType = carType;
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.dateOfProduction = dateOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                ", dateOfProduction=" + dateOfProduction;
    }
}
