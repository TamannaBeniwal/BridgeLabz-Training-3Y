package java_control_flow.level1;
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter salary
        System.out.print("Enter employee's salary: ");
        double salary = input.nextDouble();

        // Prompt user to enter years of service
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        // Variable to store calculated bonus
        double bonus = 0.0;

        // Check if employee is eligible for bonus (more than 5 years)
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% of salary
            System.out.println("Bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus. Employee has not completed more than 5 years of service.");
        }

        // Close the Scanner
        input.close();
    }
}

    
