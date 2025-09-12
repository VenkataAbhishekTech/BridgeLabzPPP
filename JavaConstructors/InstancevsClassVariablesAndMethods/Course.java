package JavaConstructors.InstancevsClassVariablesAndMethods;

import java.util.Scanner;

public class Course {
    String courseName;
    int courseDuration;
    double courseFee;

    static String instituteName = "Default Institute";

    Course(String courseName, int courseDuration, double courseFee) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseFee = courseFee;
    }
    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + courseDuration + " months");
        System.out.println("Fee: " + courseFee);
        System.out.println("------------------------------");
    }
    static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter institute name: ");
        String instName = sc.nextLine();
        Course.updateInstituteName(instName);

        System.out.print("Enter number of courses to add: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Course[] courses = new Course[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Course " + (i + 1) + ":");

            System.out.print("Enter course name: ");
            String name = sc.nextLine();

            System.out.print("Enter duration (in months): ");
            int dur = sc.nextInt();

            System.out.print("Enter course fee: ");
            double fee = sc.nextDouble();
            sc.nextLine(); 

            courses[i] = new Course(name, dur, fee);
        }

        System.out.println("\n=== Course Details ===");
        for (Course c : courses) {
            c.displayCourseDetails();
        }

        sc.close();
    }
}
