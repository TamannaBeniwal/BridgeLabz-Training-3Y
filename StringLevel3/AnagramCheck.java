package StringLevel3;

import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter second text: ");
        String text2 = scanner.nextLine();

        scanner.close();

        // Call the anagram check method and display result
        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Step 1: Check length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Step 2: Frequency arrays for both strings
        int[] freq1 = new int[26]; // for a-z
        int[] freq2 = new int[26];

        // Step 3: Count character frequencies
        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i) - 'a']++;
            freq2[str2.charAt(i) - 'a']++;
        }

        // Step 4: Compare frequency arrays
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}
