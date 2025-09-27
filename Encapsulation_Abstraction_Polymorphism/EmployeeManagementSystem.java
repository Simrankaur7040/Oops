
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}


abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
         return employeeId;
         }

    public void setEmployeeId(int employeeId) {
         this.employeeId = employeeId; 
        }

    public String getName() { 
        return name; 
    }

    public void setName(String name) {
         this.name = name; 
        }

    public double getBaseSalary() { 
        return baseSalary;
     }

    public void setBaseSalary(double baseSalary) { 
        this.baseSalary = baseSalary; 
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("----------------------------------------");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Role base value: " + baseSalary);
        System.out.println("Calculated salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee implements Department {
    private double annualBonus;
    private String department = "Unassigned";

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double annualBonus) {
        super(employeeId, name, baseSalary);
        this.annualBonus = annualBonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (annualBonus / 12.0);
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + getDepartmentDetails());
    }
}

class PartTimeEmployee extends Employee implements Department {
    private double hourlyRate;
    private double hoursWorked;
    private String department = "Unassigned";

    public PartTimeEmployee(int employeeId, String name, double baseSalary, double hourlyRate, double hoursWorked) {
        super(employeeId, name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Hours worked: " + hoursWorked + ", Hourly rate: " + hourlyRate);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee ft1 = new FullTimeEmployee(101, "Riya", 50000.00 / 12.0, 6000.00);
        ft1.assignDepartment("Engineering");

        FullTimeEmployee ft2 = new FullTimeEmployee(102, "piya", 45000.00 / 12.0, 3000.00);
        ft2.assignDepartment("HR");

        PartTimeEmployee pt1 = new PartTimeEmployee(201, "leo", 0.0, 25.0, 80.0);
        pt1.assignDepartment("Support");

        PartTimeEmployee pt2 = new PartTimeEmployee(202, "raj", 0.0, 30.0, 40.0);
        pt2.assignDepartment("Marketing");

        Employee[] employees = { ft1, pt1, ft2, pt2 };

        System.out.println("========= EMPLOYEE PAYROLL REPORT =========");
        double totalPayroll = 0.0;

        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            e.displayDetails();
            if (e instanceof Department) {
                Department d = (Department) e;
                System.out.println("(Department via interface) " + d.getDepartmentDetails());
            }
            System.out.println();
            totalPayroll += e.calculateSalary();
        }

        System.out.println("Total payroll for this period: " + totalPayroll);
    }
}
