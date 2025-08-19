package java_control_flow.level2;
import java.util.Scanner;
public class EmployeeBonusCalculator {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get employee salary input
        System.out.print("Enter the employee's salary: ");
        double salary = input.nextDouble();

        // Get years of service input
        System.out.print("Enter the years of service: ");
        int yearsOfService = input.nextInt();

        // Initialize bonus variable
        double bonus = 0.0;

        // Calculate bonus if years of service > 5
        if (yearsOfService > 5) {
            bonus = salary * 0.05;  // 5% of salary
        }

        // Print the bonus amount
        System.out.printf("The bonus amount is: %.2f\n", bonus);

        // Close the scanner
        input.close();
    }
}

    

