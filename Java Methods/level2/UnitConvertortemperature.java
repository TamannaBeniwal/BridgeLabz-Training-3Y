public class UnitConvertortemperature {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    // Main method to test the conversions
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = 37;
        double pounds = 150;
        double kilograms = 68;
        double gallons = 10;
        double liters = 5;

        System.out.printf("%.2f °F = %.2f °C%n", fahrenheit, convertFahrenheitToCelsius(fahrenheit));
        System.out.printf("%.2f °C = %.2f °F%n", celsius, convertCelsiusToFahrenheit(celsius));
        System.out.printf("%.2f pounds = %.2f kg%n", pounds, convertPoundsToKilograms(pounds));
        System.out.printf("%.2f kg = %.2f pounds%n", kilograms, convertKilogramsToPounds(kilograms));
        System.out.printf("%.2f gallons = %.2f liters%n", gallons, convertGallonsToLiters(gallons));
        System.out.printf("%.2f liters = %.2f gallons%n", liters, convertLitersToGallons(liters));
    }
}
