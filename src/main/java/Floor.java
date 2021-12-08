import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Floor {
    private String floorId;
    private Entry entry;
    private Exit exit;
    private ParkingSpace parkingSpace;
}
