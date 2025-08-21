package Array.level1;
import java.util.Scanner;
public class FactorFinder {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Variable to store the user input number
        int number;

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer to find its factors: ");

        // Validate user input
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();

            // Check if number is positive
            if (number <= 0) {
                System.out.println("Error: Please enter a number greater than 0.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.close();
            return;
        }

        // Initial size for factors array
        int maxFactor = 10;

        // Declare array to hold factors and index tracker
        int[] factors = new int[maxFactor];
        int index = 0;

        // Loop to find factors of the number
        for (int i = 1; i <= number; i++) {
            // If i is a factor of number
            if (number % i == 0) {
                // If current index reaches array size, resize the array
                if (index == maxFactor) {
                    // Double the maxFactor size
                    maxFactor *= 2;

                    // Create a temporary array with new size
                    int[] temp = new int[maxFactor];

                    // Copy existing factors to new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Reassign temp to factors
                    factors = temp;
                }

                // Store the factor in the array and increment index
                factors[index] = i;
                index++;
            }
        }

        // Display the factors
        System.out.println("\nFactors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
