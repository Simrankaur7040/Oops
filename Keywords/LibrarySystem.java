class Book {
    private static String libraryName = "City Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    public void displayBookDetails(){
        if(this instanceof Book){
            System.out.println("--------------------------------");
            System.out.println("Library :"+libraryName);
            System.out.println("ISBN :"+isbn);
            System.out.println("Title :"+title);
            System.out.println("Author :"+author);
            System.out.println("--------------------------------");
        }
    }
    public static void displayLibraryName(){
        System.out.println("Library Name :"+libraryName);
    }
}
public class LibrarySystem{
    public static void main(String[] args){
        Book book1 = new Book("978-4-64-67934-0", "Java Programming", "RK Singh");
        Book book2 = new Book("978-6-345-24564-9", "Data Structure", "SP Shukla");

        book1.displayBookDetails();
        book2.displayBookDetails();
        Book.displayLibraryName();
    }
}