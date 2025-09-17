/*7 Develop an Employee class with:
employeeID (public).
department (protected).
salary (private).
Write methods to:
Modify salary using a public method.
Create a subclass Manager to access employeeID and department.
 */

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated to " + salary);
        } else {
            System.out.println("Invalid salary!");
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------------");
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "HR", 40000);
        Employee e2 = new Employee(102, "IT", 60000);

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();

        e1.setSalary(45000);
        System.out.println("Updated Salary for " + e1.department + " Employee: " + e1.getSalary());
    }
}
