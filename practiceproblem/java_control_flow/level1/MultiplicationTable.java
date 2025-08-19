package java_control_flow.level1;
import java.util.Scanner;
public class MultiplicationTable {
  

    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number to print its multiplication table from 6 to 9: ");
        int number = input.nextInt();

        // Loop from 6 to 9 and print the multiplication table
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

        // Close the Scanner
        input.close();
    }
}


