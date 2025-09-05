import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate the number of handshakes using combination formula
    public static int calculateMaximumHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfStudents;

        System.out.print("Enter the number of students: ");
        numberOfStudents = sc.nextInt();

        int totalHandshakes = calculateMaximumHandshakes(numberOfStudents);

        System.out.println("The maximum number of possible handshakes is: " + totalHandshakes);

        sc.close();
    }
}
