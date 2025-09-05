import java.util.Scanner;

public class NumberAnalysis {

    // Method to check if number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if num1 > num2, 0 if equal, -1 if num1 < num2
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 < num2) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Take input and process each number
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (isPositive(numbers[i])) {
                System.out.print("The number is Positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            } else {
                System.out.println("The number is Negative.");
            }
        }

        // Compare first and last number in array
        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("\nComparison of first and last number: ");
        if (comparison == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (comparison == -1) {
            System.out.println("First number is less than the last number.");
        } else {
            System.out.println("First and last numbers are equal.");
        }

        sc.close();
    }
}