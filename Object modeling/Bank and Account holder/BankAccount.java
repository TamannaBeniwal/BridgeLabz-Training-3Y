public class BankAccount<bank, Customer, Bank> {
    private Bank bank;
    private Customer customer;
    private double balance;

    public BankAccount(Bank bank, Customer customer, double initialBalance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Account at " + bank.getName() + " with balance $" + balance;
    }
}
