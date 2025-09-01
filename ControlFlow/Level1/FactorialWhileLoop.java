package ControlFlow.Level1;
import java.util.Scanner;
public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if(n < 0) {
            System.out.println("Not a positive integer.");
            sc.close();
            return;
        }
        int fact = 1, i = 1;
        while(i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial: " + fact);
        sc.close();
    }
}
