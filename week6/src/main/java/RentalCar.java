public class RentalCar {
    /**
     * Main method to test the car rental system.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {

        LuxuryVehicle luxuryCar = new LuxuryVehicle("Mercedes", "S-Class", "ABC123", true, true);
        EconomyVehicle economyCar = new EconomyVehicle("Toyota", "Prius", "XYZ789", true);

        RentalRecord luxuryRental = new RentalRecord(luxuryCar, 7, "John Doe");
        RentalRecord economyRental = new RentalRecord(economyCar, 5, "Jane Smith");


        displayRentalDetails(luxuryRental);
        displayRentalDetails(economyRental);
    }

    /**
     * Displays the details of a rental record.
     * @param rental The rental record to display.
     */
    private static void displayRentalDetails(RentalRecord rental) {
        System.out.println("Rental Details:");
        System.out.println("Vehicle: " + rental.getVehicle().getBrand() + " " + rental.getVehicle().getModel());
        System.out.println("License Plate: " + rental.getVehicle().getLicensePlate());
        System.out.println("Rental Period: " + rental.getRentalPeriodInDays() + " days");
        System.out.println("Rental Price: $" + rental.getRentalPrice());
        System.out.println("Lessor Identity: " + rental.getLessorIdentity());
        System.out.println();
    }
}
