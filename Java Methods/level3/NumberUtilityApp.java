import java.util.Arrays;

public class NumberUtilityApp {
    public static void main(String[] args) {
        int number = 153; // You can change this number to test different inputs

        System.out.println("Given Number: " + number);

        int digitCount = NumberChecker.countDigits(number);
        System.out.println("Count of Digits: " + digitCount);

        int[] digits = NumberChecker.getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        boolean isDuck = NumberChecker.isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);

        boolean isArmstrong = NumberChecker.isArmstrongNumber(number, digits);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        NumberChecker.findLargestAndSecondLargest(digits);
        NumberChecker.findSmallestAndSecondSmallest(digits);
    }
}
