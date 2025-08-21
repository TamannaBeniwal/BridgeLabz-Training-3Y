package Array.level1;
import java.util.Scanner;
public class OddEvenSeparator {

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        int number = 0;

        // Prompt and validate user input
        System.out.print("Enter a natural number (positive integer): ");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();

            // Check if it's a natural number (> 0)
            if (number <= 0) {
                System.out.println("Error: Only natural numbers (greater than 0) are allowed.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.close();
            return;
        }

        // Array size is number / 2 + 1 to safely accommodate either odd/even values
        int arraySize = number / 2 + 1;

        // Declare arrays to store odd and even numbers
        int[] oddNumbers = new int[arraySize];
        int[] evenNumbers = new int[arraySize];

        // Index trackers for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Loop through numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // Even number
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                // Odd number
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print odd numbers
        System.out.print("\nOdd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Print even numbers
        System.out.print("\nEven Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}