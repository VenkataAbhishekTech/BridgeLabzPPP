package ExtraBuiltInFunction.list1;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        int a = getInput("Enter first number: ");
        int b = getInput("Enter second number: ");
        String op = getOperation();

        switch (op) {
            case "+":
                System.out.println("Result: " + add(a, b));
                break;
            case "-":
                System.out.println("Result: " + subtract(a, b));
                break;
            case "*":
                System.out.println("Result: " + multiply(a, b));
                break;
            case "/":
                if (b != 0) {
                    System.out.println("Result: " + divide(a, b));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    public static int getInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextInt();
    }

    public static String getOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose operation (+, -, *, /): ");
        return sc.next();
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }
}
