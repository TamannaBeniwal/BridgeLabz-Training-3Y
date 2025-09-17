public class BankingSystemMain {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(101, "Alice", 1000, 0.03);
        System.out.println(savings.getAccountType());
        savings.deposit(500);
        savings.addInterest();
        savings.withdraw(2000);

        CurrentAccount current = new CurrentAccount(102, "Bob", 2000, 5000);
        System.out.println(current.getAccountType());
        current.withdraw(2500);
        current.withdraw(5000);
        }
}