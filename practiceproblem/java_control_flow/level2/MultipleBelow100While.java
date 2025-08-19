package java_control_flow.level2;
import java.util.Scanner;
public class MultipleBelow100While {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input number from user
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            int counter = 100;  // Start counter at 100

            // Loop while counter is greater than or equal to 1
            while (counter >= 1) {
                // Check if counter is a multiple of number
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;  // Decrement counter
            }
        }

        input.close();
    }
}
