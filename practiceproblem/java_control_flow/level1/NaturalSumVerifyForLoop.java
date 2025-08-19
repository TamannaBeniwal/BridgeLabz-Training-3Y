package java_control_flow.level1;
import java.util.Scanner;
public class NaturalSumVerifyForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a natural number
        System.out.print("Enter a natural number (positive integer): ");
        int n = input.nextInt();

        // Check if input is a natural number (> 0)
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Calculate sum using for loop
            int sumUsingForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumUsingForLoop += i;
            }

            // Calculate sum using formula
            int sumUsingFormula = n * (n + 1) / 2;

            // Compare results and display output
            System.out.println("Sum using for loop: " + sumUsingForLoop);
            System.out.println("Sum using formula: " + sumUsingFormula);

            if (sumUsingForLoop == sumUsingFormula) {
                System.out.println("Both computations are correct and the results match.");
            } else {
                System.out.println("There is a discrepancy between the two computations.");
            }
        }

        input.close();
    }
}
    
