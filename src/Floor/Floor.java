package Floor;

import ParkingSpot.ParkingSpot;
import Vehicle.VehicleSize;

import java.util.List;
import java.util.Optional;

public class Floor {
    List<ParkingSpot> parkingSpots;

    public Optional<ParkingSpot> getParkingSpot(VehicleSize vehicleSize) {
        return parkingSpots.stream()
                .filter(parkingSpot -> parkingSpot.getSize() == vehicleSize && !parkingSpot.isOccupied())
                .findFirst();
    }

    public void occupyParkingSpot(int parkingSpotId) {
        for(ParkingSpot spot: parkingSpots) {
            if(spot.getId() == parkingSpotId) {
                spot.setOccupied(true);
                break;
            }
        }
    }

    public void clearParkingSpot(int parkingSpotId) {
        for(ParkingSpot spot: parkingSpots) {
            if(spot.getId() == parkingSpotId) {
                spot.setOccupied(false);
                break;
            }
        }
    }
}
