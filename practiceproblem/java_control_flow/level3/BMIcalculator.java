package java_control_flow.level3;
import java.util.Scanner;
public class BMIcalculator {
        public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take weight input in kilograms
        System.out.print("Enter your weight in kilograms (kg): ");
        double weightInKg = input.nextDouble();

        // Take height input in centimeters
        System.out.print("Enter your height in centimeters (cm): ");
        double heightInCm = input.nextDouble();

        // Convert height from centimeters to meters
        double heightInMeters = heightInCm / 100.0;

        // Calculate BMI using the formula: BMI = weight / (height * height)
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Variable to store weight status
        String weightStatus;

        // Determine weight status based on BMI value
        if (bmi <= 18.4) {
            weightStatus = "Underweight";
        } else if (bmi <= 24.9) {
            weightStatus = "Normal weight";
        } else if (bmi <= 39.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }

        // Display the BMI and weight status
        System.out.printf("\nYour BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + weightStatus);

        // Close the Scanner
        input.close();
    }
}
    