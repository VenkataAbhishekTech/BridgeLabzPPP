package JavaClassAndObject.level1;
import java.util.Scanner;
class Mobile {
    String brand;
    String model;
    double price;

    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Model: " + model);
        System.out.println("Mobile Price: $" + price);
    }
}
public class MobileDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter mobile model: ");
        String model = sc.nextLine();

        System.out.print("Enter mobile price: ");
        double price = sc.nextDouble();

        Mobile mobile = new Mobile(brand, model, price);
        mobile.displayDetails();
        sc.close();
    }
}
