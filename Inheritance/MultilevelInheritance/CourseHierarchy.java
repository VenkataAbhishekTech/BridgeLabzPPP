package Inheritance.MultilevelInheritance;
import java.util.Scanner;

class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Course Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        double finalAmount = fee - (fee * discount / 100);
        System.out.println("Final Payable Amount: " + finalAmount);
    }
}

public class CourseHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Duration (in weeks): ");
        int duration = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Platform: ");
        String platform = sc.nextLine();
        System.out.print("Is Recorded? (true/false): ");
        boolean recorded = sc.nextBoolean();
        System.out.print("Enter Fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter Discount (%): ");
        double discount = sc.nextDouble();
        PaidOnlineCourse poc = new PaidOnlineCourse(name, duration, platform, recorded, fee, discount);
        poc.displayCourseInfo();
        sc.close();
    }
}
