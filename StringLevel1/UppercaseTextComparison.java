package StringLevel1;

import java.util.Scanner;
public class UppercaseTextComparison {
    public static String convertToUppercase(String inputText) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result.append(ch);
        }

        return result.toString();
    }

    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a text string: ");
        String userInput = scanner.nextLine();


        String builtInUppercase = userInput.toUpperCase();
        String customUppercase = convertToUppercase(userInput);
        boolean areEqual = compareStrings(builtInUppercase, customUppercase);

        System.out.println("\nBuilt-in Uppercase : " + builtInUppercase);
        System.out.println("Custom Uppercase   : " + customUppercase);
        System.out.println("Are both equal?    : " + areEqual);

        scanner.close();
    }

    
}