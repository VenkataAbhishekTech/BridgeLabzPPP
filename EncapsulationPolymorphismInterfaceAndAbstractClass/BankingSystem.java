package EncapsulationPolymorphismInterfaceAndAbstractClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (amount <= balance) balance -= amount; }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }
    public double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan(double amount) { System.out.println("Savings Loan Applied: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() > 5000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }
    public double calculateInterest() { return getBalance() * 0.02; }
    public void applyForLoan(double amount) { System.out.println("Current Loan Applied: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() > 10000; }
}
public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (Savings/Current): ");
            String type = sc.next();
            System.out.print("Enter account number: ");
            String acc = sc.next();
            System.out.print("Enter holder name: ");
            String name = sc.next();
            System.out.print("Enter initial balance: ");
            double bal = sc.nextDouble();

            if (type.equalsIgnoreCase("Savings")) accounts.add(new SavingsAccount(acc, name, bal));
            else if (type.equalsIgnoreCase("Current")) accounts.add(new CurrentAccount(acc, name, bal));
        }

        for (BankAccount acc : accounts) {
            System.out.println(acc.getHolderName() + " | Balance: " + acc.getBalance() + " | Interest: " + acc.calculateInterest());
            Loanable loan = (Loanable) acc;
            System.out.println("Loan Eligible: " + loan.calculateLoanEligibility());
            loan.applyForLoan(5000);
        }
        sc.close();
    }
}
