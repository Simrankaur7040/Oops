/* 5  Design a Book class with:
ISBN (public).
title (protected).
author (private).
Write methods to:
Set and get the author name.
Create a subclass EBook to access ISBN and title and demonstrate access modifiers.
*/

class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("-------------------------");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("978-1234567890", "Core Java", "James Gosling");
        Book b2 = new Book("978-0987654321", "Effective Java", "Joshua Bloch");

        b1.displayBookDetails();
        b2.displayBookDetails();

        b1.setAuthor("Updated Author");
        System.out.println("After Update, Author of " + b1.title + ": " + b1.getAuthor());
    }
}
