package Array;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMP_COUNT = 10;

        double[] salary = new double[EMP_COUNT];
        double[] yearsOfService = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for(int i=0;i<EMP_COUNT;i++){
            System.out.println("Enter details for Employee " + (i+1)+ " :");

            System.out.print("Salary: ");
            double sal  = sc.nextDouble();
            if(sal<=0){
                System.out.println("Invalid Salary! Try again.");
                i--;
                continue;
            }
            System.out.print("Enter years: ");
            double yer = sc.nextDouble();
            if(yer<0){
                System.out.println("Invalid year! Try again.");
                i--;
                continue;
            }
            salary[i] = sal;
            yearsOfService[i] = yer;
        }
        for(int i =0;i<EMP_COUNT;i++){
            if(yearsOfService[i]>5){
                bonus[i] = 0.05*salary[i];
            }else{
                bonus[i]= 0.02*salary[i];   
            }
            newSalary[i] = salary[i]+bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\n-------Employee Details---------");
        for(int i=0;i<EMP_COUNT;i++){
            System.out.println("Employee: "+ (i+1) + "|Total old salary: " + totalOldSalary + 
                                "|Bonus: " + totalBonus + "|New Salary: "+ totalNewSalary);
        }
        System.out.println("\n-----Total Salay-----");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}