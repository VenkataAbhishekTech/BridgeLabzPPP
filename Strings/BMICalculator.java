package Strings;

import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; 
        return weight / (heightM * heightM);
    }
    public static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }
    public static String[][] computeResults(double[][] data) {
        String[][] results = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = calculateBMI(weight, height);
            String status = getStatus(bmi);

            results[i][0] = String.valueOf(weight);
            results[i][1] = String.valueOf(height);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        return results;
    }
    public static void displayResults(String[][] results) {
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2] + "\t" + results[i][3]);
        }
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        double[][] data = new double[10][2];
        for(int i=0;i<10;i++){
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = src.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = src.nextDouble();
        }
        String[][] result = computeResults(data);
        displayResults(result);
        src.close();
    }
}
