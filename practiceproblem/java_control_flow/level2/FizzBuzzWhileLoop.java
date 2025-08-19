package java_control_flow.level2;
import java.util.Scanner;
public class FizzBuzzWhileLoop {
    public static void main(String[] args) {

        // Create Scanner for user input
        Scanner input = new Scanner(System.in);

        // Take user input for positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if input is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1; // Initialize counter

            // Loop using while until i exceeds number
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;  // Increment counter
            }
        }

        // Close the scanner
        input.close();
    }
}
    
