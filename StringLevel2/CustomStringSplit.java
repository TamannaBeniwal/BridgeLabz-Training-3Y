package StringLevel2;

import java.util.Scanner;
public class CustomStringSplit {
    
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

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();

        String[] customWords = customSplit(inputText);

        String[] builtInWords = inputText.split(" ");
        boolean areEqual = compareStringArrays(customWords, builtInWords);
        System.out.println("\nCustom Split Result:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Result:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both results equal? " + areEqual);

        scanner.close();
    }
}
    