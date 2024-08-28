package task;

public class BankAccount {
	
	
    private double balance;

   
    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void deposit(double amount, String description) {
        this.balance += amount;
        System.out.println("Deposited " + amount + " (" + description + ")");
    }

   
    public void deposit(BankAccount fromAccount, double amount) {
        if (fromAccount.balance >= amount) {
            fromAccount.balance -= amount;
            this.balance += amount;
            System.out.println("Transferred " + amount + " from account 1");
        } else {
            System.out.println("Insufficient funds in the source account.");
        }
    }

  
    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {


        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        
        account1.deposit(100);
        System.out.println("Account 1 Balance: " + account1.getBalance()); 

      
        account1.deposit(50, "Salary");
        System.out.println("Account 1 Balance: " + account1.getBalance()); 

      
        account2.deposit(account1, 500);
        System.out.println("Account 1 Balance: " + account1.getBalance()); 
        System.out.println("Account 2 Balance: " + account2.getBalance()); 
    }
}
