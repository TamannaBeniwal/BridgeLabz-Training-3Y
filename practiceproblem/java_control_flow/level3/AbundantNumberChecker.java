package java_control_flow.level3;
import java.util.Scanner;
public class AbundantNumberChecker {

    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number to check if it's an Abundant Number: ");
        int number = input.nextInt();  // User input

        // Variable to store sum of proper divisors
        int sum = 0;

        // Loop through all numbers from 1 to number - 1
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of number
            if (number % i == 0) {
                sum += i;  // Add divisor to sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        // Close the scanner
        input.close();
    }
}
    
