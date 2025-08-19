package java_control_flow.level3;
import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a year
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt(); // User input for year

        // Validate the year is within the Gregorian calendar range
        if (year < 1582) {
            System.out.println("The year " + year + " is not valid. Leap year rules apply from 1582 onward.");
        } else {
            System.out.println("\n--- Leap Year Check: Using Multiple if-else Statements ---");

            // Part 1: Using multiple if-else statements
            if (year % 400 == 0) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            }

            System.out.println("\n--- Leap Year Check: Using Single if with Logical Operators ---");

            // Part 2: Using a single if-statement with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            }
        }

        // Close Scanner
        input.close();
    }
}

    

