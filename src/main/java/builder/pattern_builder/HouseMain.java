package builder.pattern_builder;

import builder.pattern_builder.house.House;

public class HouseMain {

    public void mainHouse() {
        House house1 = new House("walls", "floors", "roof", "windows", "doors", "garage");
        House house2 = new House("walls", "floors", "roof", "windows", "doors", "garage");
    }
}
