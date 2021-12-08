public interface ParkingLotService {

    Ticket park(ParkingLot parkingLot, String floorId, VehicleInfo vehicleInfo);

    Bill unPark(ParkingLot parkingLot, Ticket ticket);
}
