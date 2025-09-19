package Inheritance.SingleInheritance;
import java.util.Scanner;
class Device{
    int deviceId;
    String status;

    Device(int deviceId, String ststus){
        this.deviceId = deviceId;
        this.status = ststus;
    }
    void displayInfo(){
        System.out.println("Device ID: "+deviceId);
        System.out.println("Ststus: "+status);
    }
}
class Thermostat extends Device{
    double temperature;

    Thermostat(int deviceId, String status, double temperature){
        super(deviceId, status);
        this.temperature = temperature;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Temperature: "+temperature);
    }
}
public class SmartHomeDevices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter device ID: ");
        int id = sc.nextInt(); 
        System.out.print("Enter device status (on/off): ");
        String status = sc.nextLine();
        System.out.print("Enter temperature setting: ");
        double temp = sc.nextDouble();
        Thermostat t = new Thermostat(id, status, temp);
        t.displayInfo();
        sc.close();
    }
}
