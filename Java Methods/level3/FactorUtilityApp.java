import java.util.Arrays;

public class FactorUtilityApp {
    public static void main(String[] args) {
        int number = 12;  // You can change this number for testing

        System.out.println("Given Number: " + number);

        int[] factors = FactorChecker.findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));

        int greatest = FactorChecker.findGreatestFactor(factors);
        System.out.println("Greatest Factor: " + greatest);

        int sum = FactorChecker.sumOfFactors(factors);
        System.out.println("Sum of Factors: " + sum);

        int product = FactorChecker.productOfFactors(factors);
        System.out.println("Product of Factors: " + product);

        double cubeProduct = FactorChecker.productOfCubesOfFactors(factors);
        System.out.println("Product of Cube of Factors: " + cubeProduct);
    }
}
