package JavaConstructors.AccessModifiers;
class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}
public class EmployeeSystem {
    public static void main(String[] args) {
        Employee emp = new Employee("E101", "HR", 50000.0);
        emp.setSalary(55000.0);
        System.out.println("Salary: " + emp.getSalary());

        Manager mgr = new Manager("M201", "Finance", 80000.0);
        mgr.displayInfo();
    }
}
