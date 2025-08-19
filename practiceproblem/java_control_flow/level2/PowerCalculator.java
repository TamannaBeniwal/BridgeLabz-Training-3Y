package java_control_flow.level2;
import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input for base number
        System.out.print("Enter the base number (positive integer): ");
        int number = input.nextInt();

        // Get input for power
        System.out.print("Enter the power (positive integer): ");
        int power = input.nextInt();

        // Check for positive integers
        if (number <= 0 || power < 0) {
            System.out.println("Please enter positive integers only (power can be zero).");
        } else {
            int result = 1;  // Initialize result to 1

            // Calculate power using loop
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            // Print the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        input.close();
    }
}
