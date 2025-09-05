import java.util.Scanner;

public class FactorsCalculator {

    // Method to find factors of a number and return as an array
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to calculate sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate sum of squares of factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumSquares = 0;
        for (int factor : factors) {
            sumSquares += Math.pow(factor, 2);
        }
        return sumSquares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            sc.close();
            return;
        }

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));

        sc.close();
    }
}
