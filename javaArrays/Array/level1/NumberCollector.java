package Array.level1;
import java.util.Scanner;
public class NumberCollector {

    public static void main(String[] args) {

        // Scanner for user input
        Scanner inputScanner = new Scanner(System.in);

        // Constant for maximum array size
        final int MAX_SIZE = 10;

        // Array to store up to 10 double values
        double[] numbers = new double[MAX_SIZE];

        // Variable to store the sum of all numbers
        double totalSum = 0.0;

        // Index for inserting elements in the array
        int currentIndex = 0;

        System.out.println("=== Number Collector ===");
        System.out.println("Enter up to 10 positive numbers. Enter 0 or a negative number to stop.");

        // Infinite loop to take input until condition is met
        while (true) {
            System.out.print("Enter number " + (currentIndex + 1) + ": ");

            // Validate input is a number
            if (inputScanner.hasNextDouble()) {
                double userInput = inputScanner.nextDouble();

                // Check for termination condition
                if (userInput <= 0) {
                    System.out.println("Terminating input (0 or negative number entered).");
                    break;
                }

                // Check if array is full
                if (currentIndex >= MAX_SIZE) {
                    System.out.println("Maximum of 10 values reached.");
                    break;
                }

                // Store the valid input in array and increment index
                numbers[currentIndex] = userInput;
                currentIndex++;

            } else {
                // Handle invalid (non-numeric) input
                System.out.println("Error: Please enter a valid number.");
                inputScanner.next(); // Clear invalid input
            }
        }

        // Calculate the total sum of entered numbers
        for (int i = 0; i < currentIndex; i++) {
            totalSum += numbers[i];
        }

        // Display the numbers and the total
        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        System.out.println("\nTotal sum of entered numbers: " + totalSum);

        // Close the scanner
        inputScanner.close();
    }
}

