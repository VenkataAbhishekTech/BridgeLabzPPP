package JavaConstructors.AccessModifiers;

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    public void showName() {
        System.out.println("Name (protected): " + name);
    }
}
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student s = new Student(101, "Abhishek", 8.5);
        System.out.println("Roll Number: " + s.rollNumber);
        System.out.println("CGPA: " + s.getCgpa());
        s.setCgpa(9.0);
        System.out.println("Updated CGPA: " + s.getCgpa());

        PostgraduateStudent pg = new PostgraduateStudent(201, "Rahul", 8.0);
        pg.showName();
    }
}
