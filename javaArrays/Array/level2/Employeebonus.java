package Array.level2;
import java.util.Scanner;
public class Employeebonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int EMPLOYEE_COUNT = 10;

        // Arrays to store employee data
        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];

        // Totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input Loop: Get salary and years of service for each employee
        System.out.println("Enter details for " + EMPLOYEE_COUNT + " employees:");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");

            // Input salary with validation
            while (true) {
                System.out.print("Enter salary: ");
                if (scanner.hasNextDouble()) {
                    double salary = scanner.nextDouble();
                    if (salary > 0) {
                        salaries[i] = salary;
                        break;
                    } else {
                        System.out.println("Salary must be greater than 0.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a numeric salary.");
                    scanner.next(); // Clear invalid input
                }
            }

            // Input years of service with validation
            while (true) {
                System.out.print("Enter years of service: ");
                if (scanner.hasNextDouble()) {
                    double years = scanner.nextDouble();
                    if (years >= 0) {
                        yearsOfService[i] = years;
                        break;
                    } else {
                        System.out.println("Years of service cannot be negative.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    scanner.next(); // Clear invalid input
                }
            }
        }

        // Processing Loop: Calculate bonus and new salary
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];

            // Add to totals
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Output results
        System.out.println("\n--- Bonus Calculation Results ---");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("Employee %d -> Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f\n",
                              i + 1, salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.println("\n--- Summary ---");
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        scanner.close();
    }
}
