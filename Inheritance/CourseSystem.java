class Course{
    String courseName;
    int duration;

    Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }
    void displayDetails(){
        System.out.println("Course Name :"+courseName);
        System.out.println("Course Duration :"+duration+" month");
    }
}
class OnlineCourse extends Course{
    String platform;
    boolean isReorded;

    public OnlineCourse(String platform, boolean isReorded, String courseName, int duration) {
        super(courseName, duration);
        this.platform = platform;
        this.isReorded = isReorded;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Platform :"+platform);
        System.out.println("Is Recorded :"+(isReorded ? "Yes" : "No"));
    }
}
class PalindromeCourse extends OnlineCourse{
    double fee;
    double discount;

    public PalindromeCourse(double fee, double discount, String platform, boolean isReorded, String courseName, int duration) {
        super(platform, isReorded, courseName, duration);
        this.fee = fee;
        this.discount = discount;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Fee :"+fee);
        System.out.println("Discount :"+discount);
    }
}

public class CourseSystem {
    public static void main(String[] args){
        Course course = new Course("BCA", 6);
        course.displayDetails();

        OnlineCourse online = new OnlineCourse("Coursiv", true, "Java Programming", 1);
        System.out.println("\n ----------Online Course--------");
        online.displayDetails();

        PalindromeCourse palindrome = new PalindromeCourse(73000, 15, "Coursera", true, "Data Science", 1);
        System.out.println("\n ---------Palindrome Course Details-------");
        palindrome.displayDetails();
    }
}