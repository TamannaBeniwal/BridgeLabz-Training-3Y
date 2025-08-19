package java_control_flow.level1;
import java.util.Scanner;
public class FactorialCAlculator {

    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial using while loop
            long factorial = 1; // Use long to handle bigger factorials
            int counter = 1;

            while (counter <= number) {
                factorial *= counter;
                counter++;
            }

            // Print the result
            System.out.println("Factorial of " + number + " is " + factorial);
        }

        // Close Scanner
        input.close();
    }
}
    
