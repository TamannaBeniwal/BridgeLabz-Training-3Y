package java_control_flow.level1;
import java.util.Scanner;
public class NaturalNumberSum {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a natural number (0 or positive integer)
        boolean isNaturalNumber = number >= 0;

        // Conditional logic based on whether the input is a natural number
        if (isNaturalNumber) {
            // Calculate the sum using the formula: sum = n * (n + 1) / 2
            int sumOfNaturalNumbers = number * (number + 1) / 2;

            // Output the result
            System.out.println("The sum of " + number + " natural numbers is " + sumOfNaturalNumbers);
        } else {
            // Output message for non-natural number
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the Scanner
        input.close();
    }
}


