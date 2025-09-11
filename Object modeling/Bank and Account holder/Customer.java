import java.util.ArrayList;
import java.util.List;

public class Customer<BankAccount> {
    private String name;
    private List<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        if (accounts.isEmpty()) {
            System.out.println("  No accounts.");
        } else {
            for (BankAccount account : accounts) {
                System.out.println("  - " + account);
            }
        }
    }
}
