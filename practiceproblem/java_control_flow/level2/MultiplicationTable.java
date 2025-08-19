package java_control_flow.level2;
import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take integer input from the user
        System.out.print("Enter a number to print its multiplication table from 6 to 9: ");
        int number = input.nextInt();

        // Loop from 6 to 9 to print the multiplication table
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Close scanner
        input.close();
    }
}
    
