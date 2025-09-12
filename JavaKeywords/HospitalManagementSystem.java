package JavaKeywords;

import java.util.Scanner;

class Patient {
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total patients in " + hospitalName + ": " + totalPatients);
    }

    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();
        Patient[] patients = new Patient[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Ailment: ");
            String ailment = sc.nextLine();
            patients[i] = new Patient(id, name, age, ailment);
        }

        for (Patient p : patients) {
            p.displayDetails();
            System.out.println("-----------------");
        }

        Patient.getTotalPatients();
        sc.close();
    }
}
