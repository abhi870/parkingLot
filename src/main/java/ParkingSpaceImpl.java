import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ParkingSpaceImpl implements ParkingSpace {
    private Map<String, ParkingSlot> parkingSlotMap;

    @Override
    public String markOccupied(VehicleInfo vehicleInfo) {
        String parkingSlotId = "";
        Optional<ParkingSlot> firstEmptyParkingSlot = parkingSlotMap.values()
                .stream()
                .filter(parkingSlot -> parkingSlot.getParkingSlotType().toString().equals(vehicleInfo.getVehicleType().toString()) && parkingSlot.isOccupied() == false)
                .findFirst();
        firstEmptyParkingSlot.ifPresent(parkingSlot -> {
            parkingSlotMap.put(parkingSlot.getId(), parkingSlot);
            parkingSlot.setOccupied(true);
        });
        if (firstEmptyParkingSlot.isPresent())
            return firstEmptyParkingSlot.get().getId();
        else
            throw new RuntimeException("slot not available");
    }

    @Override
    public void markUnOccupied(String id) {
        parkingSlotMap.get(id).setOccupied(false);
    }

    @Override
    public void print() {
        List<ParkingSlot> parkingSlots = new ArrayList<>(parkingSlotMap.values());
        parkingSlots.sort((x, y) -> x.getId().compareTo(y.getId()));
        print(parkingSlots, ParkingSlotType.TWO_WHEELER);
        System.out.println();
        print(parkingSlots, ParkingSlotType.FOUR_WHEELER);
        System.out.println();
        print(parkingSlots, ParkingSlotType.HEAVY_FOUR_WHEELER);

    }

    private void print(List<ParkingSlot> parkingSlots, ParkingSlotType parkingSlotType) {
        System.out.print("| ");
        parkingSlots.stream()
                .filter(parkingSlot -> parkingSlot.getParkingSlotType().equals(parkingSlotType))
                .forEach(parkingSlot -> System.out.print(parkingSlot.getId() + " " + parkingSlotType + " " + parkingSlot.isOccupied() + " | "));
    }
}
