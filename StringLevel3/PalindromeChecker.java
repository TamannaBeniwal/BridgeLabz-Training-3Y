package StringLevel3;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        scanner.close();

        // Clean the input: remove spaces and convert to lowercase
        text = text.replaceAll("\\s+", "").toLowerCase();

        // Logic 1: Iterative comparison using two pointers
        boolean isPalindrome1 = isPalindromeIterative(text);

        // Logic 2: Recursive comparison
        boolean isPalindrome2 = isPalindromeRecursive(text, 0, text.length() - 1);

        // Logic 3: Compare original and reversed character arrays
        boolean isPalindrome3 = isPalindromeUsingCharArray(text);

        // Display results
        System.out.println("\n--- Palindrome Check Results ---");
        System.out.println("Using Logic 1 (Two Pointer): " + isPalindrome1);
        System.out.println("Using Logic 2 (Recursion): " + isPalindrome2);
        System.out.println("Using Logic 3 (Char Arrays): " + isPalindrome3);
    }

    // Logic 1: Iterative two-pointer approach
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive approach
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to reverse a string using charAt
    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }
}