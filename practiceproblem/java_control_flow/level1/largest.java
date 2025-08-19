package java_control_flow.level1;
import java.util.Scanner;
public class largest {

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Check if each number is the largest
        boolean isFirstNumberLargest = (number1 > number2) && (number1 > number3);
        boolean isSecondNumberLargest = (number2 > number1) && (number2 > number3);
        boolean isThirdNumberLargest = (number3 > number1) && (number3 > number2);

        // Output the results
        System.out.println("Is the first number the largest? " + isFirstNumberLargest);
        System.out.println("Is the second number the largest? " + isSecondNumberLargest);
        System.out.println("Is the third number the largest? " + isThirdNumberLargest);

        // Close the Scanner
        input.close();
    }
}


