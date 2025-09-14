package EncapsulationPolymorphismInterfaceAndAbstractClass;

import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    public String patientId;
    public String name;
    public int age;
    public String diagnosis;

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDiagnosis() { return diagnosis; }

    public String getPatientDetails() {
        return "ID: " + patientId + " | Name: " + name + " | Age: " + age + " | Diagnosis: " + diagnosis;
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int daysAdmitted;
    private List<String> records = new ArrayList<>();

    public InPatient(String id, String name, int age, String diagnosis, double dailyRate, int daysAdmitted) {
        super(id, name, age, diagnosis);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
    }

    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(String id, String name, int age, String diagnosis, double consultationFee) {
        super(id, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}
public class HospitalPatientManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient("P101", "Alice", 30, "Fever", 2000, 3);
        p1.addRecord("Admitted on 12th Sept");
        p1.addRecord("Medication: Paracetamol");

        OutPatient p2 = new OutPatient("P202", "Bob", 25, "Check-up", 500);
        p2.addRecord("Visited on 13th Sept");
        p2.addRecord("Prescription: Vitamins");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Bill: " + p.calculateBill());
            MedicalRecord rec = (MedicalRecord)p;
            System.out.println("Medical Records: " + rec.viewRecords());
            System.out.println();
        }
    }
}
