package EntryPoint;

import Vehicle.Vehicle;
import Vehicle.VehicleSize;

public abstract class EntryPoint {
    static int idCounter = 0;
    private final int id;
    private final VehicleSize vehicleSize;

    protected EntryPoint(VehicleSize vehicleSize) {
        idCounter++;
        this.id = idCounter;
        this.vehicleSize = vehicleSize;
    }

    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }

    public void enter(Vehicle vehicle) {
        System.out.println("Exiting vehicle: " + vehicle.toString() + " from ExitPoint: " + id);
    }
}
