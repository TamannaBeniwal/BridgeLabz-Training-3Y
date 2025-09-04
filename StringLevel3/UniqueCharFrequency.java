package StringLevel3;

import java.util.Scanner;

public class UniqueCharFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        scanner.close();

        // Get frequencies as 2D array
        String[][] result = getCharFrequencies(text);

        // Display result
        System.out.println("\n--- Character Frequencies ---");
        for (int i = 0; i < result.length; i++) {
            if (result[i][0] != null) {
                System.out.println(result[i][0] + " = " + result[i][1]);
            }
        }
    }

    // Method to find unique characte
