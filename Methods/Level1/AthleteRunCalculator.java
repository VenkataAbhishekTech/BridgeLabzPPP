package Methods.Level1;

import java.util.Scanner;

public class AthleteRunCalculator {
    public static double calculateRounds(double side1,double side2,double side3){
        double paremeter = side1+side2+side3;
        double totaldistance = 5000;
        return totaldistance/paremeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds "
                           + "to complete a 5 km run.");
        
        sc.close();
    }
}
