package ControlFlow.Level3;
import java.util.Scanner;
public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();
        double result;
        switch(op) {
            case "+": result = first + second; break;
            case "-": result = first - second; break;
            case "*": result = first * second; break;
            case "/": result = second != 0 ? first / second : Double.NaN; break;
            default: System.out.println("Invalid Operator"); sc.close(); return;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}
