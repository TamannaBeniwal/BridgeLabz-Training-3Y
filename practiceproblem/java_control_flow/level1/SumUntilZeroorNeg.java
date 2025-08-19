package java_control_flow.level1;
import java.util.Scanner;
public class SumUntilZeroorNeg {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Initialize total sum variable
        double total = 0.0;

        while (true) {
            // Prompt user to enter a number
            System.out.print("Enter a number (0 or negative to stop): ");
            double userValue = input.nextDouble();

            // Check if the input is 0 or negative, then break the loop
            if (userValue <= 0) {
                break;
            }

            // Add the positive input to total sum
            total += userValue;
        }

        // Display the total sum after exiting the loop
        System.out.println("The total sum is: " + total);

        // Close the scanner
        input.close();
    }
}
    
