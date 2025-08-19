package java_control_flow.level2;
import java.util.Scanner;
public class FactorsFinderWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input number from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if input is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
        } else {
            System.out.print("Factors of " + number + " are: ");

            // Initialize counter
            int counter = 1;

            // Loop using while till counter < number
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.print(counter + " ");
                }
                counter++;  // Increment counter
            }

            // Print the number itself as a factor
            System.out.print(number);
            System.out.println();  // New line after printing factors
        }

        input.close();
    }
}

