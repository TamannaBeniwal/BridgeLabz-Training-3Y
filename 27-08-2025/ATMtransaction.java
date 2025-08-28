import java.util.Scanner;
public class ATMtransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;

        System.out.println("=== ATM Transaction System ===");
        int choice;
        do {
            displayMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    balance = deposit(balance, sc);
                    break;
                case 2:
                    balance = withdraw(balance, sc);
                    break;
                case 3:
                    checkBalance(balance);
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }

    
    public static void displayMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");
    }

    
    public static int deposit(int balance, Scanner sc) {
        System.out.print("Enter deposit amount: ");
        int amount = sc.nextInt();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
        return balance;
    }

    
    public static int withdraw(int balance, Scanner sc) {
        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds! Overdraft not allowed.");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
        return balance;
    }

    
    public static void checkBalance(int balance) {
        System.out.println("Current Balance: " + balance);
        if (balance < 0) {
            System.out.println(" Overdraft!");
        }
}
}