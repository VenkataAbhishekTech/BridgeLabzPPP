package JavaClassAndObject.level1;

import java.util.Scanner;
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    void displayDetails() {
        System.out.println("Circle Details: ");
        System.out.println("Radius        : " + radius);
        System.out.println("Area          : " + calculateArea());
        System.out.println("Circumference : " + calculateCircumference());
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);
        circle.displayDetails();

        sc.close();
    }
}
