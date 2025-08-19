package java_control_flow.level3;
import java.util.Scanner;
public class HarshadNumberChecker {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number to check if it's a Harshad Number: ");
        int number = input.nextInt();  // User input

        // Store the original number to use later
        int originalNumber = number;

        // Variable to store the sum of digits
        int digitSum = 0;

        // Loop to extract each digit and add to sum
        while (number != 0) {
            int digit = number % 10;       // Get the last digit
            digitSum += digit;             // Add digit to sum
            number = number / 10;          // Remove the last digit
        }

        // Check if original number is divisible by digitSum
        if (originalNumber % digitSum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }

        // Close the scanner
        input.close();
    }
}

    
