package JavaConstructors.AccessModifiers;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}
public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC12345", "John Doe", 5000.0);
        account.setBalance(6000.0);
        System.out.println("Balance: " + account.getBalance());

        SavingsAccount savings = new SavingsAccount("AC98765", "Alice Brown", 10000.0);
        savings.displayInfo();
    }
}
    

