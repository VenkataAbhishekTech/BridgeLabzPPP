package Inheritance.HierarchicalInheritance;
import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        displayDetails();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        displayDetails();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        displayDetails();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Choose Role (1-Teacher, 2-Student, 3-Staff): ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter Subject: ");
                String subject = sc.nextLine();
                Teacher t = new Teacher(name, age, subject);
                t.displayRole();
                break;
            case 2:
                System.out.print("Enter Grade: ");
                String grade = sc.nextLine();
                Student s = new Student(name, age, grade);
                s.displayRole();
                break;
            case 3:
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();
                Staff st = new Staff(name, age, dept);
                st.displayRole();
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
