import java.util.Scanner;
public class MobilePhoneMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Phone Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Phone Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Phone Price: ");
        double price = scanner.nextDouble();
        MobilePhone phone = new MobilePhone(brand, model, price);
        System.out.println("\n--- Phone Information ---");
        phone.displayDetails();

        scanner.close();
    }
}