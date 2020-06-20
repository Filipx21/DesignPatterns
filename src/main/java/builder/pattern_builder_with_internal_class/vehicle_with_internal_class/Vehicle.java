package builder.pattern_builder_with_internal_class.vehicle_with_internal_class;

public class Vehicle {

    private VehicleType vehicleType;
    private String vehicleName;
    private int vehicleAge;
    private double vehicleCapacity;

    private Vehicle(VehicleBuilder vehicleBuilder) {
        this.vehicleType = vehicleBuilder.vehicleType;
        this.vehicleName = vehicleBuilder.vehicleName;
        this.vehicleAge = vehicleBuilder.vehicleAge;
        this.vehicleCapacity = vehicleBuilder.vehicleCapacity;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getVehicleAge() {
        return vehicleAge;
    }

    public double getVehicleCapacity() {
        return vehicleCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType=" + vehicleType +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleAge=" + vehicleAge +
                ", vehicleCapacity=" + vehicleCapacity +
                '}';
    }

    public static class VehicleBuilder {

        private VehicleType vehicleType;
        private String vehicleName;
        private int vehicleAge;
        private double vehicleCapacity;

        public VehicleBuilder buildVehicleType(VehicleType vehicleType) {
            this.vehicleType = vehicleType;
            return this;
        }

        public VehicleBuilder buildVehicleName(String vehicleName) {
            this.vehicleName = vehicleName;
            return this;
        }

        public VehicleBuilder buildVehicleAge(int vehicleAge) {
            this.vehicleAge = vehicleAge;
            return this;
        }

        public VehicleBuilder buildVehicleCapacity(double vehicleCapacity){
            this.vehicleCapacity = vehicleCapacity;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }

}
