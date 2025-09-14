package EncapsulationPolymorphismInterfaceAndAbstractClass;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    public String vehicleId;
    public String driverName;
    public double ratePerKm;
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + " | Driver: " + driverName + " | Rate/km: " + ratePerKm;
    }
    public abstract double calculateFare(double distance);
}
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
class Car extends Vehicle implements GPS {
    public String location;
    public Car(String id, String driver, double rate, String location) {
        super(id, driver, rate);
        this.location = location;
    }
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String newLocation) { this.location = newLocation; }
}
class Bike extends Vehicle implements GPS {
    public String location;

    public Bike(String id, String driver, double rate, String location) {
        super(id, driver, rate);
        this.location = location;
    }
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8; 
    }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String newLocation) { this.location = newLocation; }
}
class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String id, String driver, double rate, String location) {
        super(id, driver, rate);
        this.location = location;
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; 
    }

    public String getCurrentLocation() { return location; }
    public void updateLocation(String newLocation) { this.location = newLocation; }
}
public class RideHailingApplication {
    public static void calculateRideFare(List<Vehicle> vehicles, double distance) {
        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            GPS gps = (GPS) v;
            System.out.println("Current Location: " + gps.getCurrentLocation());
            System.out.println();
        }
    }
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car("C101", "Alice", 15, "Downtown"));
        rides.add(new Bike("B202", "Bob", 10, "City Center"));
        rides.add(new Auto("A303", "Charlie", 12, "Station Road"));

        calculateRideFare(rides, 10);
    }
}
