package Array.level2;
import java.util.Scanner;
public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for number of persons
        int numberOfPersons = 0;
        while (true) {
            System.out.print("Enter the number of persons: ");
            if (scanner.hasNextInt()) {
                numberOfPersons = scanner.nextInt();
                if (numberOfPersons > 0) {
                    break;
                } else {
                    System.out.println("Number of persons must be greater than zero.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // clear invalid input
            }
        }

        // Arrays to store weight, height, BMI and status
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];

        // Input weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("\nPerson %d:\n", i + 1);

            // Input weight (kg) validation
            while (true) {
                System.out.print("Enter weight (kg): ");
                if (scanner.hasNextDouble()) {
                    weights[i] = scanner.nextDouble();
                    if (weights[i] > 0) {
                        break;
                    } else {
                        System.out.println("Weight must be greater than zero.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // clear invalid input
                }
            }

            // Input height (meters) validation
            while (true) {
                System.out.print("Enter height (meters): ");
                if (scanner.hasNextDouble()) {
                    heights[i] = scanner.nextDouble();
                    if (heights[i] > 0) {
                        break;
                    } else {
                        System.out.println("Height must be greater than zero.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // clear invalid input
                }
            }
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numberOfPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            // Determine weight status based on BMI
            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Display the result
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", heights[i], weights[i], bmis[i], statuses[i]);
        }

        scanner.close();
    }
}
