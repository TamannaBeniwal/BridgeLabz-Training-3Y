package Array.level2;
import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number (positive integer)
        System.out.print("Enter a positive integer number: ");
        long number;
        if (scanner.hasNextLong()) {
            number = scanner.nextLong();
            if (number < 0) {
                System.out.println("Error: Number must be positive.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid input. Please enter a valid positive number.");
            scanner.close();
            return;
        }

        // Step 1: Count digits in the number
        int count = 0;
        long temp = number;
        if (temp == 0) {
            count = 1; // If number is 0, digit count is 1
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        // Step 2: Store digits in array
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // Step 3: Define frequency array for digits 0-9
        int[] frequency = new int[10];

        // Step 4: Calculate frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Step 5: Display frequency of each digit
        System.out.println("\nDigit frequencies in the number " + number + ":");
        for (int digit = 0; digit < frequency.length; digit++) {
            if (frequency[digit] > 0) {
                System.out.println("Digit " + digit + ": " + frequency[digit]);
            }
        }

        scanner.close();
    }
}
    

