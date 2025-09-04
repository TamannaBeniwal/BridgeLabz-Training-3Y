public class HotelBookingMain {
    public static void main(String[] args) {
        // Booking using default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBooking();

        // Booking using parameterized constructor
        HotelBooking customBooking = new HotelBooking("john", "Deluxe", 3);
        System.out.println("Custom Booking:");
        customBooking.displayBooking();

        // Booking using copy constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("Copied Booking:");
        copiedBooking.displayBooking();
    }
}
