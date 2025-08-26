package StringLevel2;

import java.util.Random;

public class VotingEligibilityChecker {

    public static void main(String[] args) {
        int numberOfStudents = 10;

        int[] studentAges = generateRandomAges(numberOfStudents);
        String[][] votingResults = checkVotingEligibility(studentAges);
        displayVotingTable(votingResults);
    }

    // Method to generate random 2-digit ages (10 to 99)
    public static int[] generateRandomAges(int count) {
        int[] ages = new int[count];
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            ages[i] = random.nextInt(90) + 10;  
        }

        return ages;
    }

    // Method to check voting eligibility and return results in 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            results[i][0] = String.valueOf(age);

            if (age < 0) {
                results[i][1] = "Cannot Vote";
            } else if (age >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }

        return results;
    }

    // Method to display results in a table
    public static void displayVotingTable(String[][] data) {
        System.out.println("Student\tAge\tEligibility");
        System.out.println("--------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "\t" + data[i][0] + "\t" + data[i][1]);
        }
    }
}
