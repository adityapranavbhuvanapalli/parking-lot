package ExitPoint;

import Vehicle.Vehicle;
import Vehicle.VehicleSize;

public abstract class ExitPoint {
    static int idCounter = 0;
    private final int id;
    private final VehicleSize vehicleSize;

    protected ExitPoint(VehicleSize vehicleSize) {
        idCounter++;
        this.id = idCounter;
        this.vehicleSize = vehicleSize;
    }

    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }

    public void exit(Vehicle vehicle) {
        System.out.println("Exiting vehicle: " + vehicle.toString() + " from ExitPoint: " + id);
    }
}
