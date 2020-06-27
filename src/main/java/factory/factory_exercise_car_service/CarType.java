package factory.factory_exercise_car_service;

public enum CarType {
    SUV("Suv"),
    COUPE("Coupe"),
    HATCHBACK("Hatchback"),
    CABRIO("Cabrio"),
    COMBI("Combi"),
    PICK_UP("Pick-up"),
    SEDAN("Sedan"),
    MINIVAN("Minivan");

    private String typeName;

    CarType(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return typeName;
    }
}
