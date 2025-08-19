package java_control_flow.level3;
import java.util.Scanner;
public class PrimeNumberChecker {

    public static void main(String[] args) {

        // Create Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number to check if it's a Prime Number: ");
        int inputNumber = input.nextInt(); // User input

        // Boolean variable to store if the number is prime
        boolean isPrime = true;

        // Prime number check only for numbers greater than 1
        if (inputNumber <= 1) {
            isPrime = false;  // Numbers 1 and below are not prime
        } else {
            // Loop from 2 to one less than the number
            for (int i = 2; i < inputNumber; i++) {
                // If the number is divisible by any i, it's not prime
                if (inputNumber % i == 0) {
                    isPrime = false;
                    break; // No need to check further
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(inputNumber + " is a Prime Number.");
        } else {
            System.out.println(inputNumber + " is Not a Prime Number.");
        }

        // Close Scanner object
        input.close();
    }
}


