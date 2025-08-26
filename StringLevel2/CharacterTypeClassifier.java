package StringLevel2;
import java.util.Scanner;
public class CharacterTypeClassifier {


    public static String getCharacterType(char ch) {
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
    public static String[][] classifyCharacters(String input) {
        int length = 0;
        try {
            while (true) {
                input.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
        }

        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getCharacterType(ch);
        }

        return result;
    }

    public static void displayCharacterTable(String[][] table) {
        System.out.println("\nCharacter\tType");
        System.out.println("-----");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        String[][] characterTable = classifyCharacters(userInput);
        displayCharacterTable(characterTable);

        scanner.close();
    }
}

    
