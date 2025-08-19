package java_control_flow.level1;
import java.util.Scanner;
public class RocketLaunch {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the starting countdown value
        System.out.print("Enter countdown start value: ");
        int counter = input.nextInt(); // User input for countdown

        // Countdown loop: while counter is greater than or equal to 1
        while (counter >= 1) {
            // Print the current counter value
            System.out.println(counter);

            // Decrement the counter
            counter--;
        }

        // After the countdown, print launch message
        System.out.println("Launching...");

        // Close the Scanner
        input.close();
    }
}
    
