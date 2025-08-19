package java_control_flow.level1;
import java.util.Scanner;
public class SumUntilZero {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;

        // Variable to store user-entered value
        double userValue;

        // Prompt the user for input the first time
        System.out.print("Enter a number (0 to stop): ");
        userValue = input.nextDouble();

        // Continue looping until the user enters 0
        while (userValue != 0) {
            // Add the input value to the total
            total += userValue;

            // Ask the user for another input
            System.out.print("Enter another number (0 to stop): ");
            userValue = input.nextDouble();
        }

        // After the loop, display the total
        System.out.println("The total sum is: " + total);

        // Close the Scanner
        input.close();
    }
}

    
