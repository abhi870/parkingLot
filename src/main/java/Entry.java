import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class Entry implements EntryGate {
    private final ParkingStrategy parkingStrategy;

    @Override
    public Ticket park(String floorId, VehicleInfo vehicleInfo, ParkingSpace parkingSpace) {
        return parkingStrategy.park(floorId, vehicleInfo, parkingSpace);
    }
}
