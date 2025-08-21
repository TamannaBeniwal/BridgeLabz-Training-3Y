package Array.level2;
import java.util.Scanner;
public class DynamicDigitAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        // Input validation for positive integer
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

        // Initial capacity
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and dynamically resize array if needed
        int tempNumber = number;  // Use temp variable to keep original number intact
        while (tempNumber != 0) {
            // Resize if array is full
            if (index == maxDigit) {
                maxDigit += 10;  // Increase capacity by 10
                int[] tempArray = new int[maxDigit];
                // Copy old digits to new array
                for (int i = 0; i < digits.length; i++) {
                    tempArray[i] = digits[i];
                }
                digits = tempArray;  // Assign new larger array
            }

            digits[index] = tempNumber % 10;
            index++;
            tempNumber /= 10;
        }

        // Find largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int currentDigit = digits[i];
            if (currentDigit > largest) {
                secondLargest = largest;
                largest = currentDigit;
            } else if (currentDigit > secondLargest && currentDigit < largest) {
                secondLargest = currentDigit;
            }
        }

        // Display results
        System.out.println("\n--- Results ---");
        System.out.print("Digits extracted (from least to most significant): ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit: Not found (all digits are the same).");
        }

        scanner.close();
    }
}
    
