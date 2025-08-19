package java_control_flow.level2;
import java.util.Scanner;
public class FactorsFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input number from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if input is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
        } else {
            System.out.print("Factors of " + number + " are: ");

            // Loop from 1 to number (exclusive)
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            
            // Also print the number itself as a factor
            System.out.print(number);
            System.out.println();  // New line after printing factors
        }

        input.close();
    }
}
    

