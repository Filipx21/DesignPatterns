package builder.pattern_builder_with_internal_class.vehicle_with_internal_class;

public enum VehicleType {

    AUTO("Auto"),
    MOTOR("Motor"),
    ROWER("Rower"),
    INNY("Inny");

    private String type;

    VehicleType(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
