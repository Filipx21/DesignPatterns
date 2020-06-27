package factory.factory_exercise_car_service;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Bmw extends Car {

    public Bmw(CarType carType, String name, double capacity, BigDecimal price, LocalDate dateOfProduction) {
        super(carType, name, capacity, price, dateOfProduction);
    }

}
