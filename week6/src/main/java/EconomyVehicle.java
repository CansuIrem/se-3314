
public class EconomyVehicle extends Vehicle{
    private boolean isHybrid;

    /**
     * Constructor for EconomyVehicle class.
     * @param brand The brand of the economy vehicle.
     * @param model The model of the economy vehicle.
     * @param licensePlate The license plate of the economy vehicle.
     * @param isHybrid Indicates whether the economy vehicle is hybrid.
     */
    public EconomyVehicle(String brand, String model, String licensePlate, boolean isHybrid) {
        super(brand, model, licensePlate);
        this.isHybrid = isHybrid;
    }

    /**
     * Calculates the base rental price of the economy vehicle.
     * @return The base rental price of the economy vehicle.
     */
    @Override
    public double getBaseRentalPrice() {
        double basePrice = 50;
        if (isHybrid) basePrice += 10;
        return basePrice;
    }
}
