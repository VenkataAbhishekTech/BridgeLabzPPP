package Inheritance.AssistedProblems;
import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager");
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer");
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int duration; 

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern");
        System.out.println("Internship Duration: " + duration + " months");
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose Employee Type (1-Manager, 2-Developer, 3-Intern): ");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        Employee emp;
        switch (choice) {
            case 1:
                System.out.print("Enter Team Size: ");
                int teamSize = sc.nextInt();
                emp = new Manager(name, id, salary, teamSize);
                break;
            case 2:
                System.out.print("Enter Programming Language: ");
                String lang = sc.nextLine();
                emp = new Developer(name, id, salary, lang);
                break;
            case 3:
                System.out.print("Enter Internship Duration (months): ");
                int duration = sc.nextInt();
                emp = new Intern(name, id, salary, duration);
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        emp.displayDetails();
        sc.close();
    }
}
