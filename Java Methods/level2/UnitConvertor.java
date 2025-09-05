public class UnitConvertor {

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Main method to test the conversions
    public static void main(String[] args) {
        double yards = 10;
        double feet = 15;
        double meters = 2;
        double inches = 50;

        System.out.printf("%.2f yards = %.2f feet%n", yards, convertYardsToFeet(yards));
        System.out.printf("%.2f feet = %.2f yards%n", feet, convertFeetToYards(feet));
        System.out.printf("%.2f meters = %.2f inches%n", meters, convertMetersToInches(meters));
        System.out.printf("%.2f inches = %.2f meters%n", inches, convertInchesToMeters(inches));
        System.out.printf("%.2f inches = %.2f centimeters%n", inches, convertInchesToCentimeters(inches));
    }
}
