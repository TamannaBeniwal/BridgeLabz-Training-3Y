package java_control_flow.level2;
import java.util.Scanner;
public class GreatestFactorFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input number from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate positive input
        if (number <= 1) {
            System.out.println("Please enter an integer greater than 1.");
        } else {
            int greatestFactor = 1; // Initialize greatest factor as 1

            // Loop from number-1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;  // Exit loop after finding greatest factor
                }
            }

            // Display the greatest factor
            System.out.println("Greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        }

        input.close();
    }
}
