package factory;

import factory.factory_exercise_car_service.Audi;
import factory.factory_exercise_car_service.Car;
import factory.factory_exercise_car_service.CarFactoryImpl;
import factory.factory_exercise_car_service.CarType;
import factory.factory_exercise_zoo.*;
import factory.factory_introduce.Factory;
import factory.factory_introduce.Unit;
import factory.factory_introduce.UnitFactory;
import factory.factory_introduce.UnitType;

public class FactoryMain {

    private static FactoryMain instance;

    private FactoryMain(){}

    public static FactoryMain getInstance() {
        if(instance == null) {
            synchronized (FactoryMain.class) {
                if(instance == null) {
                    instance = new FactoryMain();
                }
            }
        }
        return instance;
    }

    public void run() {
//        Factory factory = UnitFactory.getInstance();
////        Unit tank = factory.createUnit(UnitType.TANK);
////        Unit rifleman = factory.createUnit(UnitType.RIFLEMAN);
////        System.out.println(tank);
////        System.out.println(rifleman);

//        AnimalFactoryImpl factory = AnimalFactoryImpl.getInstance();
//        Animal tiger = factory.createAnimal(AnimalType.TIGER);
//        Animal elephant = factory.createAnimal(AnimalType.ELEPHANT);
//
//        System.out.println(tiger);
//        System.out.println(elephant);

//        Car audi = new Audi.AudiBuilder()
//                .buildCapacity(23.43)
//                .buildModel("A4")
//                .buildCarType(CarType.COMBI)
//                .build();

//        System.out.println(audi);

        CarFactoryImpl factory = CarFactoryImpl.getInstance();
        Car audiSuv = factory.createCar(CarType.SUV);
        System.out.println(audiSuv);
    }
}
