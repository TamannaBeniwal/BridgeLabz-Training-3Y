package java_control_flow.level1;
import java.util.Scanner;
public class smallest {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        // Prompt user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Prompt user to enter the third number
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Check if the first number is smaller than both the second and third numbers
        boolean isFirstNumberSmallest = (number1 < number2) && (number1 < number3);

        // Output result in the required format
        System.out.println("Is the first number the smallest? " + isFirstNumberSmallest);

        // Close the Scanner
        input.close();
    }
}

    

