import java.util.UUID;

public class FirstEmptyFoundParkingStrategy implements ParkingStrategy {
    @Override
    public Ticket park(String floorId, VehicleInfo vehicleInfo, ParkingSpace parkingSpace) {
        Ticket ticket = new Ticket(UUID.randomUUID(), floorId, null, Long.toString(System.currentTimeMillis()));
        String assignedParkingSlotId = parkingSpace.markOccupied(vehicleInfo);
        ticket.setSlotId(assignedParkingSlotId);
        return ticket;
    }
}
