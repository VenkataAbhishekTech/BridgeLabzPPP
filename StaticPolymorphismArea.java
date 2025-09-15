class AreaCalculator {
    public int area(int side) {
        return side * side; 
    }

    public int area(int length, int breadth) {
        return length * breadth; 
    }

    public double area(double radius) {
        return Math.PI * radius * radius; 
    }
}
public class StaticPolymorphismArea {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        System.out.println("Area of square: " + calc.area(4)); 
        System.out.println("Area of rectangle: " + calc.area(4, 5)); 
        System.out.println("Area of circle: " + calc.area(3.5));
    }
}
