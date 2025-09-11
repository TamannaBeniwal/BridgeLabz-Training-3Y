import java.util.ArrayList;
import java.util.List;

public class Bank<BankAccountMain> {
    private String name;
    private List<BankAccountMain> allAccounts;

    public Bank(String name) {
        this.name = name;
        this.allAccounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Opens a new account and associates it with the customer
    public void openAccount(Customer customer, double initialBalance) {
        BankAccountMain newAccount = new BankAccountMain(this, customer, initialBalance);
        allAccounts.add(newAccount);
        customer.addAccount(newAccount);
        System.out.println("Account opened for " + customer.getName() + " at " + name + " with $" + initialBalance);
    }
}
