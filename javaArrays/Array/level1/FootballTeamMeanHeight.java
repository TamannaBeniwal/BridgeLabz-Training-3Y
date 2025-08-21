package Array.level1;
import java.util.Scanner;
public class FootballTeamMeanHeight {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Constant for the number of players in a football team
        final int TOTAL_PLAYERS = 11;

        // Declare an array to store heights of players
        double[] heights = new double[TOTAL_PLAYERS];

        // Variable to store the total sum of heights
        double totalHeight = 0;

        // Loop to take height input for each player
        for (int i = 0; i < heights.length; i++) {
            while (true) {
                System.out.print("Enter height (in cm) of player " + (i + 1) + ": ");
                
                // Validate if input is a valid double
                if (scanner.hasNextDouble()) {
                    double inputHeight = scanner.nextDouble();
                    
                    // Validate if height is a positive number
                    if (inputHeight > 0) {
                        heights[i] = inputHeight; // Store valid height
                        totalHeight += inputHeight; // Add to total
                        break; // Exit inner while loop
                    } else {
                        System.out.println("Height must be a positive number. Please try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    scanner.next(); // Clear invalid input
                }
            }
        }

        // Calculate the mean height
        double meanHeight = totalHeight / heights.length;

        // Display the result
        System.out.printf("\nMean height of the football team is: %.2f cm\n", meanHeight);

        // Close the scanner
        scanner.close();
    }
}
    
