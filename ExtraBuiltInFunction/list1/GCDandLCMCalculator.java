package ExtraBuiltInFunction.list1;

import java.util.Scanner;

public class GCDandLCMCalculator {
    public static void main(String[] args) {
        int a = getInput("Enter first number: ");
        int b = getInput("Enter second number: ");
        int gcd = findGCD(a, b);
        int lcm = findLCM(a, b, gcd);
        displayResult(a, b, gcd, lcm);
    }
    public static int getInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        int n = sc.nextInt();
        return n;
    }
    public static int findGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
    public static int findLCM(int x, int y, int gcd) {
        return (x * y) / gcd;
    }
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        
    }

}
