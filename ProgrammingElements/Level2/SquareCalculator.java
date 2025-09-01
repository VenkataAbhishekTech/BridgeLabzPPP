package ProgrammingElements.Level2;
import java.util.Scanner;
public class SquareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter perimeter: ");
        double perimeter = sc.nextDouble();
        double side = perimeter / 4.0;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        sc.close();
    }
}
