package java_control_flow.level1;
import java.util.Scanner;
public class OddEvenChecker {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a natural number
        System.out.print("Enter a natural number (positive integer): ");
        int number = input.nextInt();

        // Check if input is a natural number
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number.");
        } else {
            // Iterate from 1 to the input number
            for (int i = 1; i <= number; i++) {
                // Check if current number is even
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        // Close Scanner
        input.close();
    }
}

