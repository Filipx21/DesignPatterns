package builder.pattern_builder;

import builder.pattern_builder.animal_with_class.Animal;
import builder.pattern_builder.house_with_class.House;

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

        System.out.println(animal);
    }
}
