class Person{
    String name;
    int id;

    Person(String name, int id){
        this.name = name;
        this.id= id;
    }
    void displayDetails(){
        System.out.println("Name :"+name);
        System.out.println("ID "+id);
    }
}
interface Worker{
    void performDuties();
}
class Chef extends Person implements Worker{
    String speciality;

    public Chef(String name, int id,String speciality ) {
        super(name, id);
        this.speciality = speciality;
    }
    public void performDuties(){
        System.out.println("Role : Chef");
        displayDetails();
        System.out.println("Speciality :"+speciality);
        System.out.println("Duties : Cooking delicious dishes.");
        System.out.println("----------------------------");
    }
}
class Waiter extends Person implements Worker{
    String section;

    public Waiter(String name, int id,String selection) {
        super(name, id);
        this.section = section;
    }
    public void performDuties(){
        System.out.println("Role : Waiter");
        displayDetails();
        System.out.println("Section :"+section);
        System.out.println("Duties : Serving Customers and taking orders.");
        System.out.println("----------------------------");
    }
}
public class RestaurantSystem {
    public static void main(String[] args) {
        Worker c1 = new Chef("riya",1,"Indian Dishes");
        Worker w1 = new Waiter("piya", 20, "Outdoor Area");

        c1.performDuties();
        w1.performDuties();
    }
}