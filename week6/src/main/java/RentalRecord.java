
public class RentalRecord {
    private Vehicle vehicle;
    private int rentalPeriodInDays;
    private double rentalPrice;
    private String lessorIdentity;

    /**
     * Constructor for RentalRecord class.
     * @param vehicle The vehicle being rented.
     * @param rentalPeriodInDays The rental period in days.
     * @param lessorIdentity The identity of the lessor.
     */
    public RentalRecord(Vehicle vehicle, int rentalPeriodInDays, String lessorIdentity) {
        this.vehicle = vehicle;
        this.rentalPeriodInDays = rentalPeriodInDays;
        this.lessorIdentity = lessorIdentity;
        this.rentalPrice = calculateRentalPrice();
    }

    /**
     * Calculates the rental price based on the rental period and vehicle's base rental price.
     * @return The rental price.
     */
    private double calculateRentalPrice() {
        return vehicle.getBaseRentalPrice() * rentalPeriodInDays;
    }

    /**
     * Getter for the rented vehicle.
     * @return The rented vehicle.
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Getter for the rental period in days.
     * @return The rental period in days.
     */
    public int getRentalPeriodInDays() {
        return rentalPeriodInDays;
    }

    /**
     * Getter for the rental price.
     * @return The rental price.
     */
    public double getRentalPrice() {
        return rentalPrice;
    }

    /**
     * Getter for the lessor's identity.
     * @return The lessor's identity.
     */
    public String getLessorIdentity() {
        return lessorIdentity;
    }
}
