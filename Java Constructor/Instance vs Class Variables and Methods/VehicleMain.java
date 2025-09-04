public class VehicleMain {
    public static void main(String[] args) {
        // Create first vehicle
        Vehicle vehicle1 = new Vehicle("abc", "Car");
        vehicle1.displayVehicleDetails();


        // Create second vehicle
        Vehicle vehicle2 = new Vehicle("xyz", "Motorbike");
        vehicle2.displayVehicleDetails();

    

        // Update registration fee
        Vehicle.updateRegistrationFee(750.0);

        System.out.println("After fee update:");
        

        // Check details again
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}