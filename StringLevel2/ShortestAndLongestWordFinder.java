package StringLevel2;

import java.util.Scanner;
public class ShortestAndLongestWordFinder {
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

    public static int calculateArrayLength(String[] array) {
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


    public static String[] customSplit(String text) {
        int length = calculateLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        StringBuilder wordBuilder = new StringBuilder();
        int wordIndex = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                wordBuilder.append(ch);
            } else {
                words[wordIndex++] = wordBuilder.toString();
                wordBuilder.setLength(0);
            }
        }


        words[wordIndex] = wordBuilder.toString();

        return words;
        
    }


    public static String[][] generateWordLengthTable(String[] words) {
        int wordCount = calculateArrayLength(words);
        String[][] table = new String[wordCount][2];

        for (int i = 0; i < wordCount; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(calculateLength(words[i]));
        }

        return table;
    }

   
    public static int[] findShortestAndLongest(String[][] wordTable) {
        int minIndex = 0;
        int maxIndex = 0;

        int minLength = Integer.parseInt(wordTable[0][1]);
        int maxLength = Integer.parseInt(wordTable[0][1]);

        int rowCount = calculateArrayLength2D(wordTable);

        for (int i = 1; i < rowCount; i++) {
            int currentLength = Integer.parseInt(wordTable[i][1]);

            if (currentLength < minLength) {
                minLength = currentLength;
                minIndex = i;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static int calculateArrayLength2D(String[][] array) {
        int count = 0;
        try {
            while (true) {
                String[] temp = array[count];
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

    
        String[] words = customSplit(input);

        String[][] wordLengthTable = generateWordLengthTable(words);


        int[] resultIndexes = findShortestAndLongest(wordLengthTable);

        System.out.println("\nWord\t\tLength");
        System.out.println("-----");
        for (int i = 0; i < wordLengthTable.length; i++) {
            String word = wordLengthTable[i][0];
            int len = Integer.parseInt(wordLengthTable[i][1]);
            System.out.println(word + "\t\t" + len);
        }

        
        String shortest = wordLengthTable[resultIndexes[0]][0];
        int shortestLength = Integer.parseInt(wordLengthTable[resultIndexes[0]][1]);

        String longest = wordLengthTable[resultIndexes[1]][0];
        int longestLength = Integer.parseInt(wordLengthTable[resultIndexes[1]][1]);

        System.out.println("\nShortest word: " + shortest + " (Length: " + shortestLength + ")");
        System.out.println("Longest word : " + longest + " (Length: " + longestLength + ")");

        scanner.close();
    }
}