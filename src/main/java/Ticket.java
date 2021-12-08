import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private UUID ticketId;
    private String floorId;
    private String slotId;
    private String entryTime;
}
