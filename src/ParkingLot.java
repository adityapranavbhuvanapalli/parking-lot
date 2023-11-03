import EntryPoint.EntryPoint;
import Floor.Floor;
import Vehicle.Vehicle;
import ParkingSpot.ParkingSpot;
import ExitPoint.ExitPoint;

import java.util.List;
import Ticket.Ticket;
import java.util.Optional;

public class ParkingLot {
    List<Floor> floors;
    List<EntryPoint> entryPoints;
    List<ExitPoint> exitPoints;

    public Ticket enter(EntryPoint entryPoint, Vehicle vehicle) {
        Optional<ParkingSpot> found = null;
        int i;
        for(i=0; i<floors.size(); i++) {
            Optional<ParkingSpot> spot = floors.get(i).getParkingSpot(vehicle.getVehicleSize());
            if(spot.isPresent()) {
                found = spot;
                break;
            }
        }

        ParkingSpot parkingSpot = found.orElse(null);

        if(parkingSpot == null)
            return null;

        parkingSpot.setOccupied(true);
        entryPoint.enter(vehicle);

        return new Ticket(floors.get(i), parkingSpot, vehicle);
    }

    public void exit(ExitPoint exitPoint, Ticket ticket) {
        ParkingSpot parkingSpot = ticket.getParkingSpot();

        parkingSpot.setOccupied(false);
        exitPoint.exit(ticket.getVehicle());
    }

    public static void main(String[] args) {

    }
}