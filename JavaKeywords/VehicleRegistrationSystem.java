package JavaKeywords;

import java.util.Scanner;

class Vehicle {
    static double registrationFee = 500.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();
        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Registration Number: ");
            String regNum = sc.nextLine();
            System.out.print("Enter Owner Name: ");
            String owner = sc.nextLine();
            System.out.print("Enter Vehicle Type: ");
            String type = sc.nextLine();
            vehicles[i] = new Vehicle(regNum, owner, type);
        }

        System.out.print("Enter new registration fee: ");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("-----------------");
        }

        sc.close();
    }
}
