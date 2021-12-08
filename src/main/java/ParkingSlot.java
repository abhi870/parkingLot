import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ParkingSlot {
    private String id;
    private ParkingSlotType parkingSlotType;
    private boolean isOccupied;
}
