import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentAges = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            int age = sc.nextInt();
            studentAges[i] = age;

            boolean canVote = canStudentVote(age);
            if (age < 0) {
                System.out.println("Invalid age entered. Cannot vote.");
            } else if (canVote) {
                System.out.println("Student is eligible to vote.");
            } else {
                System.out.println("Student is NOT eligible to vote.");
            }
        }

        sc.close();
    }
}
