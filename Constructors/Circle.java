// 2 Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.

public class Circle {

    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    Circle() {
       radius=0;  
    }

    public void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        defaultCircle.display();

        Circle customCircle = new Circle(5.0);
        customCircle.display();
    }
}
