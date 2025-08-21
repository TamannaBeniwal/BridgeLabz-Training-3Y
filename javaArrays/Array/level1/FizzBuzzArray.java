package Array.level1;
import java.util.Scanner;
public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        // Prompt and validate user input for a positive integer
        System.out.print("Enter a positive integer for FizzBuzz: ");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Error: Please enter a number greater than 0.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.close();
            return;
        }

        // Declare and initialize String array to hold FizzBuzz results
        String[] fizzBuzzResults = new String[number + 1];

        // Loop from 0 to number and apply FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                fizzBuzzResults[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                fizzBuzzResults[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                fizzBuzzResults[i] = "Buzz";
            } else {
                fizzBuzzResults[i] = String.valueOf(i);
            }
        }

        // Print the results with index position
        System.out.println("\nFizzBuzz Results:");
        for (int i = 0; i < fizzBuzzResults.length; i++) {
            System.out.println("Position " + i + " = " + fizzBuzzResults[i]);
        }

        // Close scanner
        scanner.close();
    }
}
