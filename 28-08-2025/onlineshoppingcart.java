import java.util.Scanner;
public class onlineshoppingcart {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         boolean Customers = true;
        while (Customers) {
            double totalAmount = 0;
            int itemCount;

            // System.out.println("Welcome to the Online Shopping ");
            do {
                System.out.print("Enter no. of items at least 1: ");
                itemCount = sc.nextInt();
            } while (itemCount > 1);
            for (int i = 1; i <= itemCount; i++) {
                System.out.println("\nProduct Menu:");
                System.out.println("1.laptop-Rs40000");
                System.out.println("2.smartphone-Rs.20000");
                System.out.println("3.watches-Rs.3000");
                System.out.println("4.earbuds-Rs.1000");
                System.out.print("Choose product(1-5): ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        totalAmount += 40000;
                        break;
                    case 2:
                        totalAmount += 20000;
                        break;
                    case 3:
                        totalAmount += 3000;
                        break;
                    case 4:
                        totalAmount += 1000;
                        break;
                    default:
                        System.out.println("No item added");
                        break;
                }
            }
            if (totalAmount > 5000) {
                double discount = totalAmount * 0.10;
                totalAmount -= discount;
                System.out.println("10% discount of Rs. " + discount);
            } else {
                System.out.println("No discount");
            }

            System.out.println("Total amount " + totalAmount);

                System.out.println("Thank you ");
                break;
            }
        

        sc.close();
    }
}