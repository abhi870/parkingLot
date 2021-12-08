import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = setup();
        VehicleInfo vehicleInfo1 = new VehicleInfo("Abhishek", "Paithane", "MH15 GY 3125", VehicleType.TWO_WHEELER);
        System.out.println("initialized...");
        parkingLot.printSnapShot();
        System.out.println();
        ParkingLotService parkingLotService = new ParkingLotServiceImpl();
        parkingLotService.park(parkingLot, "1", vehicleInfo1);
        parkingLotService.park(parkingLot, "1", vehicleInfo1);
        parkingLotService.park(parkingLot, "1", vehicleInfo1);
//        parkingLotService.park(parkingLot, "1", vehicleInfo1);
        System.out.println();
        parkingLot.printSnapShot();
    }

    private static ParkingLot setup() {
        Entry floor1Entry = new Entry(new FirstEmptyFoundParkingStrategy());
        Entry floor2Entry = new Entry(new FirstEmptyFoundParkingStrategy());
        Exit floor1Exit = new Exit(new PerHourBillingStrategy());
        Exit floor2Exit = new Exit(new PerHourBillingStrategy());

        Floor floor1 = new Floor("1", floor1Entry, floor1Exit, new ParkingSpaceImpl(getParkingSlots()));
        Floor floor2 = new Floor("2", floor2Entry, floor2Exit, new ParkingSpaceImpl(getParkingSlots()));
        Map<String, Floor> floors = new HashMap<>();
        floors.put("1", floor1);
        floors.put("2", floor2);
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setFloors(floors);
        return parkingLot;
    }

    private static Map<String, ParkingSlot> getParkingSlots() {
        Map<String, ParkingSlot> parkingSlots = new HashMap<>();
        parkingSlots.put("1", new ParkingSlot("1", ParkingSlotType.TWO_WHEELER, false));
        parkingSlots.put("2", new ParkingSlot("2", ParkingSlotType.TWO_WHEELER, false));
        parkingSlots.put("3", new ParkingSlot("3", ParkingSlotType.TWO_WHEELER, false));
        parkingSlots.put("4", new ParkingSlot("4", ParkingSlotType.FOUR_WHEELER, false));
        parkingSlots.put("5", new ParkingSlot("5", ParkingSlotType.FOUR_WHEELER, false));
        parkingSlots.put("6", new ParkingSlot("6", ParkingSlotType.HEAVY_FOUR_WHEELER, false));
        return parkingSlots;
    }
}
