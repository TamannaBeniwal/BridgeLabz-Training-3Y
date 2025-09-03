import java.util.Scanner;

public class PalindromeCheckerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker(input);

        // Display the result
        checker.displayResult();

        scanner.close();
    }
}
