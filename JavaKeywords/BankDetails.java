package JavaKeywords;

import java.util.Scanner;

class BankAccount {
    static String bankName = "ABC Bank";
    private static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total accounts in " + bankName + ": " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        }
    }
}
public class BankDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        BankAccount[] accounts = new BankAccount[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter account number: ");
            int accNum = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter account holder name: ");
            String name = sc.nextLine();
            System.out.print("Enter balance: ");
            double bal = sc.nextDouble();
            accounts[i] = new BankAccount(accNum, name, bal);
        }

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("-----------------");
        }

        BankAccount.getTotalAccounts();
        sc.close();
    }
}
