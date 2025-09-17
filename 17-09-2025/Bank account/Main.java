// package 17-09-2025;

public class Main {
    public static void main(String[] args){
        BankAccount account = new BankAccount("123456",500,"1234");
        System.out.println("Initial Balance: "+ account.getBalance());

        account.deposit(200);
        System.out.println("Balance after deposit:"+account.getBalance());

        account.withdraw(100);
        System.out.println("Balance after withdrwal:"+account.getBalance());

        boolean isPinValid = account.validatePin("1234");
        System.out.println("Is PIN valid?"+ isPinValid);

        

        
    }
    
}
