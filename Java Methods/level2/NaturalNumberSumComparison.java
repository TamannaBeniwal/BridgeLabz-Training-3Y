import java.util.Scanner;

public class NaturalNumberSumComparison {

    // Recursive method to find sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find sum using formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number (positive integer): ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input! Please enter a natural number greater than zero.");
            sc.close();
            return;
        }

        int sumRecursion = sumUsingRecursion(number);
        int sumFormula = sumUsingFormula(number);

        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRecursion == sumFormula) {
            System.out.println("Both methods give the same result. Calculation is correct!");
        } else {
            System.out.println("Mismatch in results! Check the implementation.");
        }

        sc.close();
    }
}

