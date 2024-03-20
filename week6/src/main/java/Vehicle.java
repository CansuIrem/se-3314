
abstract class Vehicle {

    private String brand;
    private String model;
    private String licensePlate;

    /**
     * Constructor for Vehicle class.
     * @param brand The brand of the vehicle.
     * @param model The model of the vehicle.
     * @param licensePlate The license plate of the vehicle.
     */
    public Vehicle(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    /**
     * Getter for the brand of the vehicle.
     * @return The brand of the vehicle.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Getter for the model of the vehicle.
     * @return The model of the vehicle.
     */

    public String getModel() {
        return model;
    }

    /**
     * Getter for the license plate of the vehicle.
     * @return The license plate of the vehicle.
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Abstract method to get the base rental price of the vehicle.
     * @return The base rental price of the vehicle.
     */
    public abstract double getBaseRentalPrice();
}
