package factory.factory_exercise_car_service;

public class CarFactoryImpl extends CarFactory{

    private static CarFactoryImpl instance;

    private CarFactoryImpl(){}

    public static CarFactoryImpl getInstance() {
        if(instance == null){
            synchronized (CarFactoryImpl.class){
                if(instance == null) {
                    instance = new CarFactoryImpl();
                }
            }
        }
        return instance;
    }

    @Override
    public Car createCar(CarType carType) {
        switch(carType) {
            case SUV:
                return new Audi.AudiBuilder()
                        .buildName("Audi")
                        .buildModel("TT44")
                        .buildCapacity(156)
                        .buildCarType(carType)
                        .build();
            case COUPE:
                throw new NullPointerException();
            case HATCHBACK:
                throw new NullPointerException();
            case CABRIO:
                throw new NullPointerException();
            case COMBI:
                throw new NullPointerException();
            case PICK_UP:
                throw new NullPointerException();
            case SEDAN:
                throw new NullPointerException();
            case MINIVAN:
                throw new NullPointerException();
            default:
                throw new UnsupportedOperationException("There isn't that type of car in database");
        }
    }

}
