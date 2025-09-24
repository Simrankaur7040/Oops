class Employee{
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Employee Name :"+name);
        System.out.println("Employee ID :"+id);
        System.out.println("Employee Salary :"+salary);
    }
}
class Manager extends Employee{
    int teamSize;

    Manager(String name, int id, double salary, int teamSize){
        super(name,id,salary);
        this.teamSize = teamSize;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size :"+ teamSize);
    }
    
}
class Developer extends Employee{
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language :"+programmingLanguage);
    }
}
class Intern extends Employee{
    String university;

    Intern(String name, int id, double salary, String university){
        super(name, id, salary);
        this.university = university;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("University :"+university);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Aaliya",1,70000,10);
        Employee developer = new Developer("Kavya", 2, 60000,"Java");
        Employee intern = new Intern("Parul", 3, 30000, "MIT");

        System.out.println("\n --------Manager Details----------");
        manager.displayDetails();

        System.out.println("\n--------Developer Details----------");
        developer.displayDetails();

        System.out.println("\n---------Intern Details-----------");
        intern.displayDetails();
        
    }
}