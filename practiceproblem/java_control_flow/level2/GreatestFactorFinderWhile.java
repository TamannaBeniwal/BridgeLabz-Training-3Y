package java_control_flow.level2;
import java.util.Scanner;
public class GreatestFactorFinderWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input number from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate positive input greater than 1
        if (number <= 1) {
            System.out.println("Please enter an integer greater than 1.");
        } else {
            int greatestFactor = 1;         // Initialize greatest factor as 1
            int counter = number - 1;       // Start from number-1

            // Loop while counter >= 1
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;                  // Exit loop after finding greatest factor
                }
                counter--;                  // Decrement counter
            }

            // Display the greatest factor
            System.out.println("Greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        }

        input.close();
    }
}

