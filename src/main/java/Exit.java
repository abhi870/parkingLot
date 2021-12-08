import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class Exit implements ExitGate {
    private final BillingStrategy billingStrategy;

    @Override
    public Bill unpark(Ticket ticket) {
        return billingStrategy.generateBill(ticket);
    }
}
