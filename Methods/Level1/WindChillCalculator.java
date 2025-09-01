package Methods.Level1;

import java.util.Scanner;

public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double windSpeed){
        return 35.74 + (0.6215 * temperature) 
             + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temtemperature in Fahrenheit: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed in miles per hour: ");
        double windSpeed = sc.nextDouble();

        if (temperature > 50 || windSpeed < 3) {
            System.out.println("Wind chill formula is valid only for temperature <= 50°F and wind speed >= 3 mph.");
        } else {
            double windChill = calculateWindChill(temperature, windSpeed);

            System.out.println("The wind chill temperature is: " + windChill + " °F");
        }

        sc.close();
    }
}
