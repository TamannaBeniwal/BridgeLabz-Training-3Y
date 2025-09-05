import java.util.Scanner;

public class NaturalNumberSumCalculator {

    // Method to calculate sum of n natural numbers using a loop
    public static int calculateSumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter a positive integer: ");
        number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
        } else {
            int sum = calculateSumOfNaturalNumbers(number);
            System.out.println("The sum of first " + number + " natural numbers is: " + sum);
        }

        sc.close();
    }
}