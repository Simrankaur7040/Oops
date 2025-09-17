// 5 Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.

public class Book {
    String title;
    String author;
    double price;
    boolean available;

    Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author +
                           ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", 500.0, true);
        Book b2 = new Book("Python Basics", "Guido van Rossum", 300.0, true);

        b1.display();
        b2.display();

        b1.borrowBook();  
        b1.borrowBook();  

        b1.display();
    }
}
