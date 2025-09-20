package Inheritance.HybridInheritance;
import java.util.Scanner;

class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    int batteryCapacity;

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        displayDetails();
        System.out.println("Vehicle Type: Electric Vehicle");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging the battery...");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity;

    PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public void refuel() {
        displayDetails();
        System.out.println("Vehicle Type: Petrol Vehicle");
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
        System.out.println("Refueling the petrol tank...");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose Vehicle Type (1-Electric, 2-Petrol): ");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Max Speed: ");
        int speed = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter Battery Capacity (kWh): ");
                int battery = sc.nextInt();
                ElectricVehicle ev = new ElectricVehicle(model, speed, battery);
                ev.charge();
                break;
            case 2:
                System.out.print("Enter Fuel Tank Capacity (liters): ");
                int fuel = sc.nextInt();
                PetrolVehicle pv = new PetrolVehicle(model, speed, fuel);
                pv.refuel();
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
