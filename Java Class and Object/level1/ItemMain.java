
import java.util.Scanner;

public class ItemMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        String code = scanner.nextLine();

        System.out.print("Enter Item Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Item Price: ");
        double price = scanner.nextDouble();
        
        Item item = new Item(code, name, price);
        System.out.print("Enter quantity to purchase: ");
        int quantity = scanner.nextInt();

        System.out.println("\nItem Details:");
        item.displayItemDetails();

        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " items: $" + totalCost);

        scanner.close();
    }
}
