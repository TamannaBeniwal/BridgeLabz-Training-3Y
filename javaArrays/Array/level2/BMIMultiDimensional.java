package Array.level2;
import java.util.Scanner;
public class BMIMultiDimensional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of persons
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

        // 2D array: rows = persons, columns = 0-weight, 1-height, 2-BMI
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        // Input weight and height for each person with validation
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("\nPerson %d:\n", i + 1);

            // Input weight
            while (true) {
                System.out.print("Enter weight (kg): ");
                if (scanner.hasNextDouble()) {
                    double weight = scanner.nextDouble();
                    if (weight > 0) {
                        personData[i][0] = weight;
                        break;
                    } else {
                        System.out.println("Weight must be greater than zero.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // clear invalid input
                }
            }

            // Input height
            while (true) {
                System.out.print("Enter height (meters): ");
                if (scanner.hasNextDouble()) {
                    double height = scanner.nextDouble();
                    if (height > 0) {
                        personData[i][1] = height;
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

        // Calculate BMI and weight status for each person
        for (int i = 0; i < numberOfPersons; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status based on BMI
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the result
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}