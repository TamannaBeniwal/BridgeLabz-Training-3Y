public class Main {
    public static <Bank, Customer> void main(String[] args) {
        // Create banks
        Bank bankA = new Bank("Bank of A");
        Bank bankB = new Bank("Bank of B");

        // Create customers
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        // Open accounts
        bankA.openAccount(alice, 1000.00);
        bankA.openAccount(bob, 500.00);
        bankB.openAccount(alice, 1500.00);  // Alice has accounts in two banks

        // View balances
        System.out.println();
        alice.viewBalance();
        System.out.println();
        bob.viewBalance();
    }
}
