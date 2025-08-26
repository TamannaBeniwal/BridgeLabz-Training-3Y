package StringLevel1;

import java.util.Scanner;
public class NumberFormatExceptionDemo {
    public static void generateNumberFormatException(String inputText) {
        int number = Integer.parseInt(inputText);
        System.out.println("Parsed number: " + number);
    }

    
    public static void handleNumberFormatException(String inputText) {
        try {
            int number = Integer.parseInt(inputText);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid input - cannot convert to integer.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (or text to trigger exception): ");
        String userInput = scanner.nextLine();
        handleNumberFormatException(userInput);

        scanner.close();
    }
}
    
