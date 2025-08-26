package StringLevel2;

import java.util.Scanner;
public class WordLengthTable {

    public static int calculateLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] customSplit(String text) {
        int length = calculateLength(text);

        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int spaceIdx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIdx++] = i;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            int end = spaceIndexes[i];
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
            start = end + 1;
        }

        StringBuilder lastWord = new StringBuilder();
        for (int j = start; j < length; j++) {
            lastWord.append(text.charAt(j));
        }
        words[wordCount - 1] = lastWord.toString();

        return words;
    }

    public static String[][] generateWordLengthTable(String[] words) {
        int numWords = calculateLengthOfArray(words);
        String[][] table = new String[numWords][2];

        for (int i = 0; i < numWords; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(calculateLength(words[i])); 
        }

        return table;
    }

    public static int calculateLengthOfArray(String[] array) {
        int count = 0;
        try {
            while (true) {
                String temp = array[count];
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();
        String[] words = customSplit(inputText);
        String[][] wordTable = generateWordLengthTable(words);

        System.out.println("\nWord\t\tLength");
        System.out.println("------");
        for (int i = 0; i < wordTable.length; i++) {
            String word = wordTable[i][0];
            int length = Integer.parseInt(wordTable[i][1]); 
            System.out.println(word + "\t\t" + length);
        }

        scanner.close();
    }
}
    