package builder.pattern_builder_with_internal_class;

        import builder.pattern_builder_with_internal_class.animal_with_class.Animal;
        import builder.pattern_builder_with_internal_class.house_with_class.House;
        import builder.pattern_builder_with_internal_class.internal_class_builder_airport.FlightLeg;
        import builder.pattern_builder_with_internal_class.vehicle_with_internal_class.Vehicle;
        import builder.pattern_builder_with_internal_class.vehicle_with_internal_class.VehicleType;

        import java.math.BigDecimal;

public class HouseMain {

    public void mainHouse() {
        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildFloors("floors")
                .buildRoof("roofs")
                .buildRooms("rooms")
                .build();

        Animal animal = new Animal.AnimalBuilder()
                .buildAge(3)
                .buildContinent("Africa")
                .buildColor("Red")
                .buildHeight(2.33)
                .buildType("Giraffe")
                .build();

        Vehicle vehicle1 = new Vehicle.VehicleBuilder()
                .buildVehicleName("Bmw a4")
                .buildVehicleType(VehicleType.AUTO)
                .build();

        Vehicle vehicle2 = new Vehicle.VehicleBuilder()
                .buildVehicleType(VehicleType.ROWER)
                .buildVehicleAge(2)
                .build();



        House house1 = new House.HouseBuilder()
                .buildFloors("50m")
                .buildWalls("4")
                .buildWindows("10")
                .build();

        System.out.println(house1);

//        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").buildPrice(new BigDecimal(50.33)).build();
//        FlightLeg leg2 = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").build();

//        System.out.println(leg2);
    }
}
