public class CarRentalMain {
    public static void main(String[] args) {
        // Rental using default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayRentalDetails();

        // Rental using parameterized constructor
        CarRental customRental = new CarRental("rahul", "Toyota", 5);
        System.out.println("Custom Rental:");
        customRental.displayRentalDetails();
    }
}