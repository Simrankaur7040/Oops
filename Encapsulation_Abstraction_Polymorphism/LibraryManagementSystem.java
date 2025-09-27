interface Reservable{
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
abstract class LibraryItem{
    private int itemId;
    private String title;
    private String author;
    private String borrower;
    private boolean isReserved;

    public LibraryItem(int itemId,String title, String author ){
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.borrower = null;
    }
    public abstract int getLoanDuration();
    public String getItemDetails(){
        System.out.println("------------------");
        return "ID :"+ itemId + ", Title :"+ title + ", Author :"+author;
    }
    public String getBorrower(){
        return borrower;
    }
    public void setBorrower(String borrower){
        this.borrower = borrower;
    }
    public boolean isReserved(){
        return isReserved;
    }
    public void setReserved(boolean reserved){
        this.isReserved = reserved;
    }
}
class Book extends LibraryItem implements Reservable{
    public Book(int itemId, String title, String author){
        super(itemId, title, author);
    }
    public int getLoanDuration(){
        return 14;
    }
    public void reserveItem(String borrowerName){
        if(!isReserved()){
            setBorrower(borrowerName);
            setReserved(true);
            System.out.println("-------------------");
            System.out.println("Book reserved by "+borrowerName);
        }else{
            System.out.println("Book already reserved.");
        }
    }
    public boolean checkAvailability(){
        return !isReserved();
    }
}
class Magazine extends LibraryItem implements Reservable{
    public Magazine(int itemId, String title, String author){
        super(itemId, title, author);
    }
    public int getLoanDuration(){
        return 7;
    }
    @Override
    public void reserveItem(String borrowerName){
        if(!isReserved()){
            setBorrower(borrowerName);
            setReserved(true);
            System.out.println("Magazine reserved by "+borrowerName);
        }else{
            System.out.println("Magazine already reserved.");
        }
    }
    public boolean checkAvailability(){
        return !isReserved();
    }
}
class DVD extends LibraryItem implements Reservable{
    public DVD(int itemId, String title, String author){
        super(itemId, title, author);
    }
    public int getLoanDuration(){
        return 14;
    }
    public void reserveItem(String borrowerName){
        if(!isReserved()){
            setBorrower(borrowerName);
            setReserved(true);
            System.out.println("DVD reserved by "+borrowerName);
        }else{
            System.out.println("DVD already reserved.");
        }
    }
    public boolean checkAvailability(){
        return !isReserved();
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args){
        LibraryItem item1 = new Book(101, "The Alchemist", "Paulo Coelho");
        LibraryItem item2 = new Magazine(102,"National Geographic", "John");
        LibraryItem item3 = new DVD(103, "Inception", "Christopher Nolan");

        System.out.println(item1.getItemDetails() + ", Loan Duration:"+item1.getLoanDuration() + " days");
        System.out.println(item2.getItemDetails() + ", Loan Duration:"+item2.getLoanDuration() + " days");
        System.out.println(item3.getItemDetails() + ", Loan Duration:"+item3.getLoanDuration() + " days");

        ((Reservable) item1).reserveItem("Alia");
        ((Reservable) item2).reserveItem("Shivanya");
        ((Reservable) item3).reserveItem("Neha");

        System.out.println("--------------------------");
        System.out.println("Book available: "+((Reservable) item1).checkAvailability());
        System.out.println("Magazine available: "+((Reservable) item2).checkAvailability());
        System.out.println("DVD available: "+((Reservable) item3).checkAvailability());
    }
}