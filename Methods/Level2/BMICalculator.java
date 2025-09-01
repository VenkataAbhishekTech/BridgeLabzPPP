package Methods.Level2;

import java.util.Scanner;

public class BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];  
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0; 

            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = sc.nextDouble();
        }
        calculateBMI(data);
        System.out.println("\nWeight\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = data[i][2];
            String status = getBMIStatus(bmi);

            System.out.printf("%.1f\t%.1f\t\t%.1f\t\t%s\n", weight, height, bmi, status);
        }

        sc.close();
    }
}
