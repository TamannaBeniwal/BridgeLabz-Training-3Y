package java_control_flow.level2;
import java.util.Scanner;
public class OddEvenPrinter {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter a natural number (positive integer): ");
        int number = input.nextInt();

        // Check if the input is a natural number (positive integer)
        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is even or odd using modulus operator
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }

        // Close scanner
        input.close();
    }
}
    
