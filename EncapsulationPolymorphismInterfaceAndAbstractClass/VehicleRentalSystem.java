package EncapsulationPolymorphismInterfaceAndAbstractClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String policyNumber;
    public Car(String num, double rate, String policyNumber) {
        super(num, "Car", rate);
        this.policyNumber = policyNumber;
    }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return getRentalRate() * 0.1; }
    public String getInsuranceDetails() { return "Car Insurance, Policy: " + policyNumber; }
}

class Bike extends Vehicle implements Insurable {
    private String policyNumber;
    public Bike(String num, double rate, String policyNumber) {
        super(num, "Bike", rate);
        this.policyNumber = policyNumber;
    }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return getRentalRate() * 0.05; }
    public String getInsuranceDetails() { return "Bike Insurance, Policy: " + policyNumber; }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber;
    public Truck(String num, double rate, String policyNumber) {
        super(num, "Truck", rate);
        this.policyNumber = policyNumber;
    }
    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
    public double calculateInsurance() { return getRentalRate() * 0.2; }
    public String getInsuranceDetails() { return "Truck Insurance, Policy: " + policyNumber; }
}
public class VehicleRentalSystem {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (Car/Bike/Truck): ");
            String type = sc.next();
            System.out.print("Enter vehicle number: ");
            String num = sc.next();
            System.out.print("Enter rental rate: ");
            double rate = sc.nextDouble();
            System.out.print("Enter policy number: ");
            String policy = sc.next();

            if (type.equalsIgnoreCase("Car")) vehicles.add(new Car(num, rate, policy));
            else if (type.equalsIgnoreCase("Bike")) vehicles.add(new Bike(num, rate, policy));
            else if (type.equalsIgnoreCase("Truck")) vehicles.add(new Truck(num, rate, policy));
        }

        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();

        for (Vehicle v : vehicles) {
            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = (v instanceof Insurable) ? ((Insurable)v).calculateInsurance() : 0;
            System.out.println(v.getType() + " " + v.getVehicleNumber() + " | Rental: " + rentalCost + " | Insurance: " + insuranceCost + " | " + ((Insurable)v).getInsuranceDetails());
        }
        sc.close();
    } 
}
