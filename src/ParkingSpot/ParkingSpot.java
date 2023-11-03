package ParkingSpot;

import Vehicle.VehicleSize;

public class ParkingSpot {
    private int id;
    private boolean isOccupied;
    private VehicleSize size;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public VehicleSize getSize() {
        return size;
    }

    public void setSize(VehicleSize size) {
        this.size = size;
    }


}
