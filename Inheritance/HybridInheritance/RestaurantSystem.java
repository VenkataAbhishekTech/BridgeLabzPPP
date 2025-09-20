package Inheritance.HybridInheritance;
import java.util.Scanner;

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        displayDetails();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Cooking dishes and managing the kitchen.");
    }
}

class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public void performDuties() {
        displayDetails();
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tablesAssigned);
        System.out.println("Duties: Serving food and attending customers.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose Role (1-Chef, 2-Waiter): ");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter Chef Specialty: ");
                String specialty = sc.nextLine();
                Chef chef = new Chef(name, id, specialty);
                chef.performDuties();
                break;
            case 2:
                System.out.print("Enter Number of Tables Assigned: ");
                int tables = sc.nextInt();
                Waiter waiter = new Waiter(name, id, tables);
                waiter.performDuties();
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
