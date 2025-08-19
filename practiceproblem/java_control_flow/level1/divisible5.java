package java_control_flow.level1;
import java.util.Scanner;
public class divisible5 {


    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int userNumber = input.nextInt(); // User input

        // Check if the number is divisible by 5 using modulus operator
        boolean isDivisibleByFive = (userNumber % 5 == 0);

        // Output result using required format
        System.out.println("Is the number " + userNumber + " divisible by 5? " + isDivisibleByFive);

        // Close the Scanner
        input.close();
    }
}

    
