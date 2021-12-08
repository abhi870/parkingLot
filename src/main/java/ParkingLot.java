import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ParkingLot {
    private Map<String, Floor> floors;

    void printSnapShot() {
        System.out.println("Floor1");
        this.getFloors().get("1").getParkingSpace().print();

        //
        System.out.println();
        System.out.println("Floor2");
        this.getFloors().get("2").getParkingSpace().print();
    }


}
