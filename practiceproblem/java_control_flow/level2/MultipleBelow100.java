package java_control_flow.level2;
import java.util.Scanner;
public class MultipleBelow100 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input number from user
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            // Loop backward from 100 down to 1
            for (int i = 100; i >= 1; i--) {
                // Check if i is a multiple of number (i % number == 0)
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }

        input.close();
    }
}
    
