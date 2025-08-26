package StringLevel2;

import java.util.Scanner;
public class VowelConsonantCounter {
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); 
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }


        return "Not a Letter";
    }
    public static int[] countVowelsAndConsonants(String input) {
        int vowels = 0;
        int consonants = 0;

        int length = 0;

        try {
            while (true) {
                input.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {

        }
        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);
            String type = checkCharacterType(currentChar);

            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        int[] result = countVowelsAndConsonants(inputText);
        System.out.println("\nVowel count     : " + result[0]);
        System.out.println("Consonant count : " + result[1]);

        scanner.close();
    }
}