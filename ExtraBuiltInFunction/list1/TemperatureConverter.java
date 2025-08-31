package ExtraBuiltInFunction.list1;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("C")) {
            double celsius = toCelsius(temp);
            System.out.println(temp + "°F = " + celsius + "°C");
        } else if (choice.equalsIgnoreCase("F")) {
            double fahrenheit = toFahrenheit(temp);
            System.out.println(temp + "°C = " + fahrenheit + "°F");
        } else {
            System.out.println("Invalid choice");
        }
    }

    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9.0;
    }

    public static double toFahrenheit(double c) {
        return (c * 9 / 5.0) + 32;
    }
}
