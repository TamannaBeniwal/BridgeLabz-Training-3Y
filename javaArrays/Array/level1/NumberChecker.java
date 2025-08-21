package Array.level1;
import java.util.Scanner;
public class NumberChecker {

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner inputScanner = new Scanner(System.in);

        // Constant for the number of elements
        final int TOTAL_NUMBERS = 5;

        // Integer array to store user inputs
        int[] numberArray = new int[TOTAL_NUMBERS];

        // Variable to temporarily hold user input
        int inputNumber;

        System.out.println("=== Number Analysis Program ===");

        // Loop to get user input for 5 numbers
        for (int i = 0; i < numberArray.length; i++) {
            while (true) {
                System.out.print("Enter number " + (i + 1) + ": ");

                // Validate that input is an integer
                if (inputScanner.hasNextInt()) {
                    inputNumber = inputScanner.nextInt();
                    numberArray[i] = inputNumber;
                    break; // Exit input loop
                } else {
                    System.out.println("Error: Please enter a valid integer.");
                    inputScanner.next(); // Clear invalid input
                }
            }
        }

        System.out.println("\n=== Number Classification ===");

        // Loop through the array and analyze each number
        for (int i = 0; i < numberArray.length; i++) {
            int currentNumber = numberArray[i];

            // Check if the number is positive
            if (currentNumber > 0) {
                if (currentNumber % 2 == 0) {
                    System.out.println("Number " + currentNumber + " is positive and even.");
                } else {
                    System.out.println("Number " + currentNumber + " is positive and odd.");
                }
            }
            // Check if the number is negative
            else if (currentNumber < 0) {
                System.out.println("Number " + currentNumber + " is negative.");
            }
            // Number is zero
            else {
                System.out.println("Number " + currentNumber + " is zero.");
            }
        }

        System.out.println("\n=== First and Last Element Comparison ===");

        int firstElement = numberArray[0];
        int lastElement = numberArray[numberArray.length - 1];

        // Compare first and last elements
        if (firstElement == lastElement) {
            System.out.println("The first element (" + firstElement + ") is equal to the last element (" + lastElement + ").");
        } else if (firstElement > lastElement) {
            System.out.println("The first element (" + firstElement + ") is greater than the last element (" + lastElement + ").");
        } else {
            System.out.println("The first element (" + firstElement + ") is less than the last element (" + lastElement + ").");
        }

        // Close the scanner
        inputScanner.close();
    }
}

    
