
public class LuxuryVehicle extends Vehicle {
    private boolean hasGPS;
    private boolean hasLeatherSeats;

    /**
     * Constructor for LuxuryVehicle class.
     * @param brand The brand of the luxury vehicle.
     * @param model The model of the luxury vehicle.
     * @param licensePlate The license plate of the luxury vehicle.
     * @param hasGPS Indicates whether the luxury vehicle has GPS.
     * @param hasLeatherSeats Indicates whether the luxury vehicle has leather seats.
     */
    public LuxuryVehicle(String brand, String model, String licensePlate, boolean hasGPS, boolean hasLeatherSeats) {
        super(brand, model, licensePlate);
        this.hasGPS = hasGPS;
        this.hasLeatherSeats = hasLeatherSeats;
    }
    /**
     * Calculates the base rental price of the luxury vehicle.
     * @return The base rental price of the luxury vehicle.
     */
    @Override
    public double getBaseRentalPrice() {
        double basePrice = 100;
        if (hasGPS) basePrice += 20;
        if (hasLeatherSeats) basePrice += 30;
        return basePrice;
    }
}