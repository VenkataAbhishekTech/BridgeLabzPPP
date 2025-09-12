package JavaConstructors.InstancevsClassVariablesAndMethods;

import java.util.Scanner;

public class VehicleRegistration {
    String ownerName;
    String vehicleType;

    static double registrationFee = 5000.0; 
    VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("------------------------------");
    }
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter new registration fee: ");
        double fee = sc.nextDouble();
        sc.nextLine(); 
        VehicleRegistration.updateRegistrationFee(fee);

        System.out.print("Enter number of vehicles to register: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        VehicleRegistration[] vehicles = new VehicleRegistration[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Vehicle " + (i + 1) + ":");

            System.out.print("Enter owner name: ");
            String owner = sc.nextLine();

            System.out.print("Enter vehicle type (Car/Bike/Truck): ");
            String type = sc.nextLine();

            vehicles[i] = new VehicleRegistration(owner, type);
        }
        System.out.println("\n=== Vehicle Details ===");
        for (VehicleRegistration v : vehicles) {
            v.displayVehicleDetails();
        }

        sc.close();
    }
}
