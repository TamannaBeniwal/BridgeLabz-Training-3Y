package java_control_flow.level1;
import java.util.Scanner;
public class RocketLaunchForLoop{

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the starting countdown value
        System.out.print("Enter countdown start value: ");
        int countdownStart = input.nextInt(); // User input for countdown

        // Countdown using for loop: from countdownStart down to 1
        for (int counter = countdownStart; counter >= 1; counter--) {
            // Print the current counter value
            System.out.println(counter);
        }

        // After the countdown, print launch message
        System.out.println("Launching...");

        // Close the Scanner
        input.close();
    }
}
    
