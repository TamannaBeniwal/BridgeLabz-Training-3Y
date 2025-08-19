package java_control_flow.level2;
import java.util.Scanner;
public class FizzBuzz {
   
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take user input for number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {
                // Check multiples of 3 and 5 first
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
                // Check multiple of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                // Check multiple of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                // Else print the number
                else {
                    System.out.println(i);
                }
            }
        }

        // Close scanner
        input.close();
    }
}
    

