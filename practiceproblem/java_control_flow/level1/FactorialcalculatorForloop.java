package java_control_flow.level1;
import java.util.Scanner;
public class FactorialcalculatorForloop {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a natural number (positive integer)
        System.out.print("Enter a natural number (positive integer): ");
        int number = input.nextInt();

        // Check if input is a natural number
        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using for loop
            long factorial = 1; // Use long for larger values

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print the factorial result
            System.out.println("Factorial of " + number + " is " + factorial);
        }

        // Close the scanner
        input.close();
    }
}

    
