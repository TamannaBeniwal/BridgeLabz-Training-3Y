package java_control_flow.level3;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {

        // Create Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();

        // Input second number
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();

        // Clear buffer and input operator
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = input.next();

        // Variable to store the result of operation
        double result;

        // Using switch...case to perform operation based on op
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                // Handle division by zero
                if (second == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = first / second;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                // If operator is not one of the four valid operators
                System.out.println("Invalid Operator.");
                break;
        }

        // Close Scanner
        input.close();
    }
}

    
