package java_control_flow.level1;
import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        // Create Scanner object for reading user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter age
        System.out.print("Enter the person's age: ");
        int age = input.nextInt(); // Store user input in 'age' variable

        // Check voting eligibility based on age
        if (age >= 18) {
            // If age is 18 or more, the person can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // If age is less than 18, the person cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the Scanner object
        input.close();
    }
}
    

