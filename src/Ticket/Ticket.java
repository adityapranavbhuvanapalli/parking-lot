package Ticket;

import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;
import Floor.Floor;

public class Ticket {
    static int ticketIdCounter = 0;
    int ticketId;
    Floor floor;
    ParkingSpot parkingSpot;
    Vehicle vehicle;

    public Ticket(Floor floor, ParkingSpot parkingSpot, Vehicle vehicle) {
        ticketIdCounter++;
        this.ticketId = ticketIdCounter;
        this.floor = floor;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }

    public static int getTicketIdCounter() {
        return ticketIdCounter;
    }

    public int getTicketId() {
        return ticketId;
    }

    public Floor getFloor() {
        return floor;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
