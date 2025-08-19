package java_control_flow.level3;
import java.util.Scanner;
public class ArmstrongNumberChecker {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number to check if it is an Armstrong Number: ");
        int number = input.nextInt();  // User input

        // Define and initialize variables
        int sum = 0;  // To store the sum of cubes of digits
        int originalNumber = number;  // Store original number for final comparison

        // Loop through digits until originalNumber becomes 0
        while (originalNumber != 0) {
            // Get the last digit using modulus operator
            int digit = originalNumber % 10;

            // Calculate cube of the digit and add to sum
            sum += digit * digit * digit;

            // Remove the last digit from originalNumber using division
            originalNumber = originalNumber / 10;
        }

        // Compare original number and the calculated sum
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is Not an Armstrong Number.");
        }

        // Close Scanner
        input.close();
    }
}

    
