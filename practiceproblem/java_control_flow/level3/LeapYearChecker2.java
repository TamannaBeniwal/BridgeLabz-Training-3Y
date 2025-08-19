package java_control_flow.level3;
import java.util.Scanner;
public class LeapYearChecker2 {

  
    public static void main(String[] args) {

        // Create a Scanner object for reading user input
        Scanner input = new Scanner(System.in);

        // Fixed value: Starting year of the Gregorian calendar
        final int GREGORIAN_START_YEAR = 1582;

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String userName = input.nextLine();  // User input: name

        // Ask the user to enter a year
        System.out.print("Hello " + userName + "! Please enter a year (>= " + GREGORIAN_START_YEAR + "): ");
        int inputYear = input.nextInt();  // User input: year

        // Variable to store the result message
        String leapYearResult;

        // Single if-statement using logical operators to determine if it's a leap year
        if (inputYear >= GREGORIAN_START_YEAR &&
            ((inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0))) {

            // If condition is true, it's a leap year
            leapYearResult = inputYear + " is a Leap Year.";
        } else if (inputYear < GREGORIAN_START_YEAR) {
            // If year is less than 1582, it's invalid
            leapYearResult = "Invalid year. Please enter a year >= " + GREGORIAN_START_YEAR + ".";
        } else {
            // All other valid years that don't satisfy leap year rules
            leapYearResult = inputYear + " is Not a Leap Year.";
        }

        // Print the final result
        System.out.println(leapYearResult);

        // Close the Scanner object
        input.close();
    }
}

    

