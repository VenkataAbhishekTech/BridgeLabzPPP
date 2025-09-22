interface Payable {
    double calculatePayment();
}
class Patient {
    private int patientId;
    private String name;
    private int age;
    private String medicalHistory;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = "Not Provided";
    }
    public Patient(int patientId, String name, int age, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    public String getSummary() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age +
               ", Medical History: " + medicalHistory;
    }

    public void displayInfo() {
        System.out.println("Patient: " + name + " (ID: " + patientId + ")");
    }
}
class InPatient extends Patient {
    private int roomNumber;
    private String admissionDate;

    public InPatient(int patientId, String name, int age, String admissionDate, int roomNumber) {
        super(patientId, name, age);
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient: " + getSummary() + 
                           ", Room: " + roomNumber + ", Admission Date: " + admissionDate);
    }
}
class OutPatient extends Patient {
    private String appointmentDate;

    public OutPatient(int patientId, String name, int age, String appointmentDate) {
        super(patientId, name, age);
        this.appointmentDate = appointmentDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("OutPatient: " + getSummary() + 
                           ", Appointment Date: " + appointmentDate);
    }
}
class Doctor {
    private int doctorId;
    private String name;
    private String specialization;

    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public void displayInfo() {
        System.out.println("Doctor: " + name + " (ID: " + doctorId + "), Specialization: " + specialization);
    }
}
class Bill implements Payable {
    private int billId;
    private double amount;
    private double discount;
    private double tax;

    public Bill(int billId, double amount, double discount, double tax) {
        this.billId = billId;
        this.amount = amount;
        this.discount = discount;
        this.tax = tax;
    }

    @Override
    public double calculatePayment() {
        double discountedAmount = amount - (amount * discount / 100);
        double total = discountedAmount + (discountedAmount * tax / 100);
        return total;
    }

    public void displayBill() {
        System.out.println("Bill ID: " + billId + ", Final Amount: " + calculatePayment());
    }
}
public class HospitalManagement {
    public static void main(String[] args) {
         InPatient p1 = new InPatient(101, "John Doe", 45, "2025-09-20", 202);
        OutPatient p2 = new OutPatient(102, "Jane Smith", 30, "2025-09-22");

        Doctor d1 = new Doctor(501, "Dr. Alice", "Cardiology");

        Bill b1 = new Bill(1001, 5000, 10, 5);

        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();
        b1.displayBill();
    }
}
