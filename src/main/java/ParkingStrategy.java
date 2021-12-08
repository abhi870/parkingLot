public interface ParkingStrategy {
    Ticket park(String floorId, VehicleInfo vehicleInfo, ParkingSpace parkingSpace);
}
