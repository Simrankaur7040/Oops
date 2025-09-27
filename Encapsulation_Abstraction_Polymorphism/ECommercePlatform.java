interface Taxable{
    double calculateTax();
    String getTaxDetails();
}
abstract class Product{
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public int getProductId(){
        return productId;
    }
    public void setProductId(int productId){
        this.productId = productId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public abstract double calculateDiscount();
    public void displayProduct(){
        System.out.println("Product ID: " + productId );
        System.out.println(" Name: " + name );
        System.out.println(" Price: " + price);
    }
}
class Electronics extends Product implements Taxable{
    public Electronics(int id,String name, double price){
        super(id,name,price);
    }
    public double calculateDiscount(){
        return getPrice() * 0.10;
    }
    public double calculateTax(){
        return getPrice() * 0.18;
    }
    public String getTaxDetails(){
        return "Electronics Tax :18%";
    }
}
class Clothing extends Product implements Taxable{
    public Clothing(int id,String name, double price){
        super(id, name, price);
    }
    public double calculateDiscount(){
        return getPrice() * 0.20;
    }
    public double calculateTax(){
        return getPrice() * 0.05;
    }
    public String getTaxDetails(){
        return "Clothing Tax : 5%";
    }
}
class Groceries extends Product{
    public Groceries(int id, String name, double price){
        super(id,name,price);
    }
    public double calculateDiscount(){
        return getPrice() * 0.05;
    }
}
public class ECommercePlatform {

    public static void printFinalPrice(Product p){
        p.displayProduct();

        double discount = p.calculateDiscount();
        double tax = 0;

        if(p instanceof Taxable){
            tax = ((Taxable) p).calculateTax();
            System.out.println(((Taxable)p).getTaxDetails());
        }else{
            System.out.println("No tax applicable.");
        }

        double finalPrice = p.getPrice()+tax-discount;

        System.out.println("Discount :"+discount);
        System.out.println("Tax :"+tax);
        System.out.println("Final Price :"+finalPrice);
        System.out.println("------------------");
    }
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(101, "Laptop", 50000),
            new Clothing(102, "Shirt", 2000),
            new Groceries(103, "Rice Bag", 1500)
        };
        for(Product p : products){
            printFinalPrice(p);
        }
    }
}