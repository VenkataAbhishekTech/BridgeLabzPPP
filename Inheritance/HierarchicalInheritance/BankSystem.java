package Inheritance.HierarchicalInheritance;
import java.util.Scanner;

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        displayDetails();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        displayDetails();
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int tenure;

    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        displayDetails();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Tenure: " + tenure + " years");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();
        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Choose Account Type (1-Savings, 2-Checking, 3-Fixed Deposit): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter Interest Rate: ");
                double rate = sc.nextDouble();
                SavingsAccount sa = new SavingsAccount(accNum, balance, rate);
                sa.displayAccountType();
                break;
            case 2:
                System.out.print("Enter Withdrawal Limit: ");
                double limit = sc.nextDouble();
                CheckingAccount ca = new CheckingAccount(accNum, balance, limit);
                ca.displayAccountType();
                break;
            case 3:
                System.out.print("Enter Tenure (years): ");
                int tenure = sc.nextInt();
                FixedDepositAccount fda = new FixedDepositAccount(accNum, balance, tenure);
                fda.displayAccountType();
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
