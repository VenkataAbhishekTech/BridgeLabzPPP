package Methods.Level3;

import java.util.Random;

public class EmployeeBonus {
    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2];

        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000); 
            int years = 1 + rand.nextInt(10);         
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] empData) {
        double[][] results = new double[empData.length][3]; 

        for (int i = 0; i < empData.length; i++) {
            int salary = empData[i][0];
            int years = empData[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05; 
            } else {
                bonus = salary * 0.02; 
            }

            double newSalary = salary + bonus;

            results[i][0] = bonus;
            results[i][1] = newSalary;
            results[i][2] = salary;
        }
        return results;
    }

    public static void displayResults(int[][] empData, double[][] results) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-5s %-12s %-12s %-12s %-15s %-12s\n", 
                          "ID", "Old Salary", "Years", "Bonus", "New Salary", "Bonus %");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 0; i < empData.length; i++) {
            int salary = empData[i][0];
            int years = empData[i][1];
            double bonus = results[i][0];
            double newSalary = results[i][1];
            double bonusPercent = (years > 5) ? 5 : 2;

            System.out.printf("%-5d %-12d %-12d %-12.2f %-15.2f %-12.0f\n", 
                              (i + 1), salary, years, bonus, newSalary, bonusPercent);

            totalOld += salary;
            totalNew += newSalary;
            totalBonus += bonus;
        }

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-5s %-12.2f %-12s %-12.2f %-15.2f\n", 
                          "TOTAL", totalOld, "", totalBonus, totalNew);
        System.out.println("-----------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int[][] empData = generateEmployeeData(10);      
        double[][] results = calculateBonus(empData);     
        displayResults(empData, results);                 
    }
}
