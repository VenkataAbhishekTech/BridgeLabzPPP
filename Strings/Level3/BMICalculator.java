package Strings.Level3;
import java.util.Scanner;
public class BMICalculator {
    public static double getBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }
    public static String getStatus(double bmi) {
        if(bmi < 18.5) return "Underweight";
        else if(bmi < 25) return "Normal";
        else if(bmi < 30) return "Overweight";
        else return "Obese";
    }
    public static String[][] getBMITable(double[][] data) {
        String[][] table = new String[data.length][4];
        for(int i = 0; i < data.length; i++) {
            double bmi = getBMI(data[i][0], data[i][1]);
            table[i][0] = String.format("%.1f", data[i][0]);
            table[i][1] = String.format("%.1f", data[i][1]);
            table[i][2] = String.format("%.2f", bmi);
            table[i][3] = getStatus(bmi);
        }
        return table;
    }
    public static void displayTable(String[][] table) {
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\tStatus");
        for(int i = 0; i < table.length; i++) {
            System.out.println((i+1) + "\t" + table[i][0] + "\t" + table[i][1] + "\t" + table[i][2] + "\t" + table[i][3]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        String[][] table = getBMITable(data);
        displayTable(table);
        sc.close();
    }
}
