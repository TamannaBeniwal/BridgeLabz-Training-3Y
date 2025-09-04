package StringLevel3;

import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Call the method to get character frequencies
        String[] result = getCharacterFrequency(input);

        // Display the result
        System.out.println("\n--- Character Frequencies ---");
        for (String entry : result) {
            if (entry != null) {
                System.out.println(entry);
            }
        }
    }

    // Method to find frequency of characters
    public static String[] getCharacterFrequency(String text) {
        // Convert string to char array
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // Frequency logic using nested loops
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1; // Start frequency at 1

            // Skip already counted characters
            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark as counted
                }
            }
        }

        // Create 1D String array to store "char = frequency"
        String[] result = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ' && chars[i] != '0') { // Skip spaces and duplicates
                result[i] = chars[i] + " = " + freq[i];
            }
        }

        return result;
    }
}