package ExtraBuiltInFunction.list1;

import java.util.Scanner;
public class FactorialUsingRecursion {
     public static void main(String[] args) {
        int num = getInput();
        long result = factorial(num);
        displayResult(num, result);
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        return n;
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void displayResult(int n, long fact) {
        System.out.println("Factorial of " + n + " is: " + fact);
    }
    
}
