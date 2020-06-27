package factory.factory_introduce;

public class UnitFactory extends Factory {

    private static UnitFactory instance;

    private UnitFactory() {}

    public static UnitFactory getInstance() {
        if(instance == null){
            synchronized (UnitFactory.class) {
                if(instance == null) {
                    instance = new UnitFactory();
                }
            }
        }
        return instance;
    }

    @Override
    public Unit createUnit(UnitType unitType) {
        switch(unitType) {
            case TANK:
                return new Tank(200, 0, 20);
            case RIFLEMAN:
                return new Rifleman(100, 0, 10);
            default:
                throw new UnsupportedOperationException("Nie ma takiej jednostki w bazie");
        }

    }

}
