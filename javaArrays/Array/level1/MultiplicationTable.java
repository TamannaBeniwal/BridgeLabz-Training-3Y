package Array.level1;
import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner inputScanner = new Scanner(System.in);

        // Constant for the table size (1 to 10)
        final int TABLE_SIZE = 10;

        // Array to store multiplication results
        int[] multiplicationTable = new int[TABLE_SIZE];

        // Variable to store the number entered by user
        int number;

        System.out.println("=== Multiplication Table Generator ===");

        // Input block: Prompt user and validate input
        while (true) {
            System.out.print("Enter an integer number to generate its multiplication table: ");
            if (inputScanner.hasNextInt()) {
                number = inputScanner.nextInt();
                break; // Valid input received
            } else {
                System.out.println("Error: Please enter a valid integer.");
                inputScanner.next(); // Clear invalid input
            }
        }

        // Generate multiplication table using a loop
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = number * (i + 1);
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 0; i < multiplicationTable.length; i++) {
            int multiplier = i + 1;
            int result = multiplicationTable[i];
            System.out.println(number + " * " + multiplier + " = " + result);
        }

        // Close the scanner
        inputScanner.close();
    }
}
