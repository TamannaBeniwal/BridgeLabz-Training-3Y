package java_control_flow.level3;
import java.util.Scanner;
public class Digitcounter {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter an integer
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();  // User input

        // Handle negative numbers by converting to positive
        number = Math.abs(number);

        // Special case: if number is 0, it has 1 digit
        if (number == 0) {
            System.out.println("The number has 1 digit.");
        } else {
            // Variable to count the digits
            int count = 0;

            // Loop until number becomes 0
            while (number != 0) {
                // Remove the last digit from the number
                number = number / 10;

                // Increment the count
                count++;
            }

            // Display the digit count
            System.out.println("The number has " + count + " digit(s).");
        }

        // Close Scanner
        input.close();
    }
}

