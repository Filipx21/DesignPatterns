package factory.factory_exercise_zoo;

public enum AnimalType {

    TIGER("Tiger"),
    ELEPHANT("Elephant");

    private String type;

    AnimalType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
