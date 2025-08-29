package ControlFlow.Level1;
import java.util.Scanner;
public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if(n < 0) {
            System.out.println("Not a positive integer.");
            sc.close();
            return;
        }
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
        sc.close();
    }
}
