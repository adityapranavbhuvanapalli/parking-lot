package Vehicle;

public abstract class Vehicle {
    protected final String vehicleId;

    protected final VehicleSize vehicleSize;

    public Vehicle(String vehicleId, VehicleSize vehicleSize) {
        this.vehicleId = vehicleId;
        this.vehicleSize = vehicleSize;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }
}
