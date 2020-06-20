package builder.pattern_builder_with_internal_class;

        import builder.pattern_builder_with_internal_class.animal_with_class.Animal;
        import builder.pattern_builder_with_internal_class.house_with_class.House;
        import builder.pattern_builder_with_internal_class.vehicle_with_internal_class.Vehicle;
        import builder.pattern_builder_with_internal_class.vehicle_with_internal_class.VehicleType;

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

        System.out.println(vehicle1);
        System.out.println(vehicle2);
    }
}
