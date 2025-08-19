package java_control_flow.level2;
import java.util.Scanner;
public class YoungestandTallestFriends {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        // Input heights (in cm)
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = input.nextDouble();

        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = input.nextDouble();

        // Find youngest friend based on age
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend;

        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find tallest friend based on height
        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend;

        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Display results
        System.out.println("\nYoungest friend: " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("Tallest friend: " + tallestFriend + " (Height: " + tallestHeight + " cm)");

        input.close();
    }
}
