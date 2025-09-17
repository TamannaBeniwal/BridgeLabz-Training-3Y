public class BankAccount {
     String accountNumber;
     double balance;
     String pin;

    
    public BankAccount(String accountNumber, double initialBalance, String pin) {
        this.accountNumber = accountNumber;
        this.pin = pin;

    
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    
    public double getBalance() {
        return balance;
    }

    public boolean setBalance(double newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
            return true;
        }
        return false; 
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false; 
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false; 
    }

    public boolean validatePin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
