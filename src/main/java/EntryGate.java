public interface EntryGate {
    Ticket park(String floorId, VehicleInfo vehicleInfo, ParkingSpace parkingSpace);
}
