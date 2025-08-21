package Array.level1;
import java.util.Scanner;
public class votingeligibility {

    public static void main(String[] args) {

        // Scanner object for taking user input
        Scanner inputScanner = new Scanner(System.in);

        // Constant for total number of students
        final int TOTAL_STUDENTS = 10;

        // Array to store ages of students
        int[] studentAges = new int[TOTAL_STUDENTS];

        // Variable to store user input
        int enteredAge;

        // Display message to user
        System.out.println("=== Voting Eligibility Checker ===");

        // Loop to take age input for all students
        for (int i = 0; i < studentAges.length; i++) {
            while (true) { // Loop until valid input is received
                System.out.print("Enter the age of student " + (i + 1) + ": ");

                // Validate input
                if (inputScanner.hasNextInt()) {
                    enteredAge = inputScanner.nextInt();

                    // Check for negative age
                    if (enteredAge < 0) {
                        System.out.println("Error: Age cannot be negative. Please enter a valid age.");
                    } else {
                        studentAges[i] = enteredAge; // Store valid age
                        break; // Exit inner loop
                    }

                } else {
                    System.out.println("Error: Invalid input. Please enter a valid integer.");
                    inputScanner.next(); // Clear invalid input
                }
            }
        }

        System.out.println("\n=== Voting Eligibility Results ===");

        // Loop to check voting eligibility for each student
        for (int i = 0; i < studentAges.length; i++) {
            int currentAge = studentAges[i];

            if (currentAge >= 18) {
                System.out.println("Student " + (i + 1) + " with age " + currentAge + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + currentAge + " cannot vote.");
            }
        }

        // Close the scanner
        inputScanner.close();
    }
}

    
