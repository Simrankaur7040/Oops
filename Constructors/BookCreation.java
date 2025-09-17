// 1 Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.

public class BookCreation {
    String title;
    String author;
    double price;

    BookCreation() {
        title = "The jungle book";
        author = "Rudyard Kipling";
        price = 0.0;
    }

    BookCreation(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: INR " + price);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        BookCreation b1 = new BookCreation();
        BookCreation b2 = new BookCreation("Java Programming", "James Gosling", 599.99);
        b1.display();
        b2.display();
    }
}