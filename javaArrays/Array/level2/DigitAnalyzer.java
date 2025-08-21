package Array.level2;
import java.util.Scanner;
public class DigitAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare the number variable
        int number = 0;

        // Take user input and validate
        System.out.print("Enter a positive integer number: ");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Error: Number must be a positive integer.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.close();
            return;
        }

        // Variables and array declarations
        final int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store in array
        while (number != 0) {
            if (index == maxDigit) {
                System.out.println("Only the first 10 digits will be considered.");
                break;
            }
            int digit = number % 10;      // Get the last digit
            digits[index] = digit;        // Store in array
            index++;                      // Increment array index
            number = number / 10;         // Remove the last digit
        }

        // Initialize largest and second largest
        int largest = -1;
        int secondLargest = -1;

        // Loop through the digits array to find largest and second-largest digits
        for (int i = 0; i < index; i++) {
            int currentDigit = digits[i];

            if (currentDigit > largest) {
                // Shift largest to secondLargest
                secondLargest = largest;
                largest = currentDigit;
            } else if (currentDigit > secondLargest && currentDigit < largest) {
                secondLargest = currentDigit;
            }
        }

        // Display the results
        System.out.println("\n--- Results ---");
        System.out.print("Digits entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit: Not found (all digits are the same).");
        }

        // Close the scanner
        scanner.close();
    }
}
