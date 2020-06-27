package factory.factory_exercise_zoo;

public class AnimalFactoryImpl extends AnimalFactory {

    private static AnimalFactoryImpl instance;

    private AnimalFactoryImpl() {}

    public static AnimalFactoryImpl getInstance() {
        if(instance == null) {
            synchronized (AnimalFactoryImpl.class){
                if(instance == null) {
                    instance = new AnimalFactoryImpl();
                }
            }
        }
        return instance;
    }

    @Override
    public Animal createAnimal(AnimalType animalType) {
        switch (animalType) {
            case TIGER:
                return new Tiger(2, 1.2, "Asia", "Mateusz");
            case ELEPHANT:
                return new Elephant(3, 2.5, "Africa", "Maniek");
            default:
                throw new UnsupportedOperationException("There isn't in zoo");
        }
    }

}
