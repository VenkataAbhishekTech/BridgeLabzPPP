package JavaConstructors.level1;

import java.util.Scanner;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double pricePerDay;

    // Default constructor
    CarRental() {
        customerName = "Unknown Customer";
        carModel = "Standard Car";
        rentalDays = 1;
        pricePerDay = 1000; 
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays, double pricePerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.pricePerDay = pricePerDay;
    }

    // Copy constructor
    CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.pricePerDay = other.pricePerDay;
    }

    // Method to calculate total cost
    double calculateCost() {
        return rentalDays * pricePerDay;
    }

    // Display rental details
    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Price per Day: " + pricePerDay);
        System.out.println("Total Cost: " + calculateCost());
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CarRental rental1 = new CarRental();
        System.out.println("Rental 1 (Default Constructor):");
        rental1.display();

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter car model: ");
        String model = sc.nextLine();

        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();

        System.out.print("Enter price per day: ");
        double price = sc.nextDouble();

        CarRental rental2 = new CarRental(name, model, days, price);
        System.out.println("\nRental 2 (Parameterized Constructor):");
        rental2.display();

        CarRental rental3 = new CarRental(rental2);
        System.out.println("Rental 3 (Copied from Rental 2):");
        rental3.display();

        sc.close();
    }
}
