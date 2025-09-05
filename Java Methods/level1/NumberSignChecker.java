import java.util.Scanner;

public class NumberSignChecker {

    // Method to check sign of the number
    public static int checkNumberSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput;

        System.out.print("Enter an integer: ");
        userInput = sc.nextInt();

        int result = checkNumberSign(userInput);

        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }
}