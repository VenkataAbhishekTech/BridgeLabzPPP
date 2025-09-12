package JavaKeywords;

import java.util.Scanner;

class Student {
    static String universityName = "Global University";
    private static int totalStudents = 0;
    final int rollNumber;
    String name;
    double grade;

    Student(int rollNumber, String name, double grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total students in " + universityName + ": " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    void updateGrade(double newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
        }
    }
}
public class UniversityStudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Grade: ");
            double grade = sc.nextDouble();
            sc.nextLine();
            students[i] = new Student(roll, name, grade);
        }

        Student.displayTotalStudents();
        for (Student s : students) {
            s.displayDetails();
            System.out.println("-----------------");
        }

        System.out.print("Enter roll number of student to update grade: ");
        int rollToUpdate = sc.nextInt();
        System.out.print("Enter new grade: ");
        double newGrade = sc.nextDouble();
        for (Student s : students) {
            if (s.rollNumber == rollToUpdate) {
                s.updateGrade(newGrade);
                break;
            }
        }

        System.out.println("Updated Student Details:");
        for (Student s : students) {
            s.displayDetails();
            System.out.println("-----------------");
        }

        sc.close();
    }
}
