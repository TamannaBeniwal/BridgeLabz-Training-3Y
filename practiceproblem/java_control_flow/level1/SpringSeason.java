package java_control_flow.level1;
import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter month
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        // Prompt user to enter day
        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();

        // Variable to store whether it's spring
        boolean isSpringSeason = false;

        // Check if the date is within the Spring Season (March 20 - June 20)
        if ((month == 3 && day >= 20 && day <= 31) ||        // March 20–31
            (month == 4 && day >= 1 && day <= 30) ||         // April 1–30
            (month == 5 && day >= 1 && day <= 31) ||         // May 1–31
            (month == 6 && day >= 1 && day <= 20)) {         // June 1–20
            isSpringSeason = true;
        }

        // Output result
        if (isSpringSeason) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        // Close the Scanner
        input.close();
    }
}
    

