
public interface ParkingSpace {
    String markOccupied(VehicleInfo vehicleInfo);
    void markUnOccupied(String id);
    void print();
}
