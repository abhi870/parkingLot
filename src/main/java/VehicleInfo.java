import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleInfo {
    private String ownerFirstName;
    private String ownerLastName;
    private String no;
    private VehicleType vehicleType;
}
