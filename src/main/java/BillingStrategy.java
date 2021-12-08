public interface BillingStrategy {
    Bill generateBill(Ticket ticket);
}
