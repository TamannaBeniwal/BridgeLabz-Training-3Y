package StringLevel2;

import java.util.Scanner;
public class StringLengthCalculator {

    public static int calculateLengthWithoutUsingLength(String inputText) {
        int count = 0;

        try {
            while (true) {
                inputText.charAt(count); 
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String userInput = scanner.next();

        int builtInLength = userInput.length();

        int calculatedLength = calculateLengthWithoutUsingLength(userInput);

        System.out.println("\nBuilt-in .length()        : " + builtInLength);
        System.out.println("Custom calculated length  : " + calculatedLength);

        scanner.close();
    }
}
    
