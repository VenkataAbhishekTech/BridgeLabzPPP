package JavaConstructors.level1;

public class Circle {
    double radius;

    Circle() {
        this(1.0); 
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("Circle 1 (Default Constructor):");
        c1.display();

        System.out.println();

        Circle c2 = new Circle(5.0);
        System.out.println("Circle 2 (Parameterized Constructor):");
        c2.display();
    }
}
