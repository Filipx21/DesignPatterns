package builder.classical_builder;

import builder.classical_builder.classical_builder_airport.AirLine;
import builder.classical_builder.classical_builder_airport.AirLineDirector;
import builder.classical_builder.classical_builder_airport.MiddleFlight;
import builder.classical_builder.house.BigHouseBuilder;
import builder.classical_builder.house.House;
import builder.classical_builder.house.HouseDirector;
import builder.classical_builder.house.SmallHouseBuilder;

public class BuilderWithInterface {

    public void run(){
//        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
//        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();
//
//        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
//        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
//
//        smallHouseDirector.buildHouse();
//        bigHouseDirector.buildHouse();
//
//        House smallHouse = smallHouseBuilder.getHouse();
//        House bigHouse = bigHouseDirector.getHouse();
//
//        System.out.println(smallHouse);
//        System.out.println(bigHouse);

        MiddleFlight middleFlight = new MiddleFlight();
        AirLineDirector airLineDirector = new AirLineDirector(middleFlight);
        airLineDirector.buildAirLine();
        AirLine airLine = airLineDirector.getAirLine();
        System.out.println(airLine);
    }

}
