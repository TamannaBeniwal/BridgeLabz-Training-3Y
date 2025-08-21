package Array.level1;
import java.util.Scanner;
public class Matrixto1Darray {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        int rows = 0;
        int columns = 0;

        // Input and validate number of rows
        while (true) {
            System.out.print("Enter number of rows (positive integer): ");
            if (scanner.hasNextInt()) {
                rows = scanner.nextInt();
                if (rows > 0) break;
                else System.out.println("Rows must be greater than 0.");
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next(); // Clear invalid input
            }
        }

        // Input and validate number of columns
        while (true) {
            System.out.print("Enter number of columns (positive integer): ");
            if (scanner.hasNextInt()) {
                columns = scanner.nextInt();
                if (columns > 0) break;
                else System.out.println("Columns must be greater than 0.");
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next(); // Clear invalid input
            }
        }

        // Declare and initialize 2D array (matrix)
        int[][] matrix = new int[rows][columns];

        // Take input for matrix elements
        System.out.println("\nEnter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                while (true) {
                    System.out.print("Element at (" + i + "," + j + "): ");
                    if (scanner.hasNextInt()) {
                        matrix[i][j] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter an integer.");
                        scanner.next(); // Clear invalid input
                    }
                }
            }
        }

        // Declare and initialize 1D array to store matrix elements
        int[] flattenedArray = new int[rows * columns];
        int index = 0; // Index tracker for 1D array

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                flattenedArray[index] = matrix[i][j];
                index++;
            }
        }

        // Display the 1D array
        System.out.println("\n1D array (flattened from 2D matrix):");
        for (int i = 0; i < flattenedArray.length; i++) {
            System.out.print(flattenedArray[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
