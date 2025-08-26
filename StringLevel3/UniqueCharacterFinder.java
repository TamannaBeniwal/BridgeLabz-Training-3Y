package StringLevel3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniqueCharacterFinder {

    public static void main(String[] args) {
        try {
            String userInput = getUserInput();

            int textLength = getTextLength(userInput);
            char[] uniqueCharacters = findUniqueCharacters(userInput, textLength);

            displayUniqueCharacters(uniqueCharacters);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }

    // Method to read user input
    public static String getUserInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        return reader.readLine();
    }

    // Method to calculate string length without using length()
    public static int getTextLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // throws exception when index is out of bounds
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // end of string reached
        }
        return count;
    }

    // Method to find unique characters using charAt() and return as an array
    public static char[] findUniqueCharacters(String text, int length) {
        char[] tempUnique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempUnique[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a final array of only the unique characters found
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempUnique[i];
        }

        return uniqueChars;
    }

    // Method to display the array of unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.println("\nUnique Characters in the String:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
