class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age= age;
    }
    void displayDetails(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
}
class Teacher extends Person{
    String subject;

    Teacher(String name, int age, String subject){
        super(name,age);
        this.subject = subject;
    }
    void displayRole(){
        System.out.println("Role : Teacher");
        displayDetails();
        System.out.println("Subject :"+subject);
        System.out.println("----------------");
    }
}
class Student extends Person{
    String grade;

    public Student(String name, int age,String grade) {
        super(name, age);
        this.grade = grade;
    }
    void displayRole(){
        System.out.println("Role : Student");
        displayDetails();
        System.out.println("Grade :"+grade);
        System.out.println("----------------");
    }
}
class Staff extends Person{
    String department;

    Staff(String name, int age,String department){
        super(name,age);
        this.department = department;
    }
     void displayRole(){
        System.out.println("Role : Teacher");
        displayDetails();
        System.out.println("Department :"+department);
        System.out.println("----------------");
    }
}
public class SchoolSystem {
    public static void main(String[] args){

        Teacher teacher = new Teacher("Mrs. Sharma", 33, "Data Science");
        teacher.displayRole();

        Student student = new Student("Riya", 20, "12th Grade");
        student.displayRole();

        Staff staff = new Staff("Mrs. Kapoor", 36,"Administration" );
        staff.displayRole();
    }
}