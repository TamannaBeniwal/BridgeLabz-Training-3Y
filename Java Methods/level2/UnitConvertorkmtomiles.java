public class UnitConvertorkmtomiles {

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Main method for quick testing
    public static void main(String[] args) {
        double km = 5;
        double miles = 3;
        double meters = 10;
        double feet = 20;

        System.out.printf("%.2f km = %.2f miles%n", km, convertKmToMiles(km));
        System.out.printf("%.2f miles = %.2f km%n", miles, convertMilesToKm(miles));
        System.out.printf("%.2f meters = %.2f feet%n", meters, convertMetersToFeet(meters));
        System.out.printf("%.2f feet = %.2f meters%n", feet, convertFeetToMeters(feet));
    }
}
