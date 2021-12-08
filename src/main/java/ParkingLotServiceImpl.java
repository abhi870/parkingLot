public class ParkingLotServiceImpl implements ParkingLotService {
    @Override
    public Ticket park(ParkingLot parkingLot, String floorId, VehicleInfo vehicleInfo) {
        Floor floor = parkingLot.getFloors().get(floorId);
        Ticket ticket = floor.getEntry().park(floorId, vehicleInfo, floor.getParkingSpace());
        parkingLot.getFloors().put(floorId, floor);
        return ticket;
    }

    @Override
    public Bill unPark(ParkingLot parkingLot, Ticket ticket) {
        return null;
    }
}
