package Array.level2;
import java.util.Scanner;
public class FindHeightChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of friend names
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays to store age and height of friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height for each friend
        for (int i = 0; i < friends.length; i++) {
            System.out.println("\nEnter details for " + friends[i] + ":");

            // Input age with validation
            while (true) {
                System.out.print("Age (in years): ");
                if (scanner.hasNextInt()) {
                    int age = scanner.nextInt();
                    if (age > 0) {
                        ages[i] = age;
                        break;
                    } else {
                        System.out.println("Age must be greater than 0.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next(); // clear invalid input
                }
            }

            // Input height with validation
            while (true) {
                System.out.print("Height (in cm): ");
                if (scanner.hasNextDouble()) {
                    double height = scanner.nextDouble();
                    if (height > 0) {
                        heights[i] = height;
                        break;
                    } else {
                        System.out.println("Height must be greater than 0.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // clear invalid input
                }
            }
        }

        // Find youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < friends.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\n--- Result ---");
        System.out.println("Youngest friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        scanner.close();
    }
}
