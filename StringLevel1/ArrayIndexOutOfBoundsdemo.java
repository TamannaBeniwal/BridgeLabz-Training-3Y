package StringLevel1;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsdemo {
    public static void generateArrayIndexOutOfBoundsException(String[] names, int index){
        System.out.println("Accessing name at index " + index + ": " + names[index]);
    }


    public static void handleArrayIndexOutOfBoundsException(String[] names, int index) {
        try {
            System.out.println("Accessing name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid index " + index + " for array of length " + names.length);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nameArray = {"Alice", "Bob", "Charlie", "Diana"};
        System.out.print("Enter an index to access a name (0 to " + (nameArray.length - 1) + "): ");
        int userIndex = scanner.nextInt();

        System.out.println("\n--- Generating ArrayIndexOutOfBoundsException ---");
    

        System.out.println("\n--- Handling ArrayIndexOutOfBoundsException ---");
        handleArrayIndexOutOfBoundsException(nameArray, userIndex);

        scanner.close();
    }
}
    
    

