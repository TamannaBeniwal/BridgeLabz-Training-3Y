package java_control_flow.level2;
import java.util.Scanner;
public class PowerCalculatorWhile {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input for base number
        System.out.print("Enter the base number (integer): ");
        int number = input.nextInt();

        // Get input for power
        System.out.print("Enter the power (non-negative integer): ");
        int power = input.nextInt();

        // Check for valid input
        if (power < 0) {
            System.out.println("Please enter a non-negative integer for power.");
        } else {
            int result = 1;      // Initialize result to 1
            int counter = 0;     // Initialize counter to 0

            // Use while loop to multiply number power times
            while (counter < power) {
                result *= number;
                counter++;
            }

            // Print the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        input.close();
    }
}

    
