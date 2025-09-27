interface Discountable{
    double applyDiscount(double totalPrice);
    String getDiscountDetails();
}
abstract class FoodItem{
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;

    }
    public abstract double calculateTotalPrice();
    public String getItemDetails(){
        return "Item: "+itemName+", Price: "+price+ ", Quantity: "+quantity;
    }

    public String getItemName(){
        return itemName;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }
}
class VegItem extends FoodItem implements Discountable{
    public VegItem(String itemName, double price, int quantity){
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice(){
        return getPrice() * getQuantity();
    }
    public double applyDiscount(double totalPrice){
        return totalPrice * 0.90;
    }
    public String getDiscountDetails(){
        return "10% discount applied on Veg item.";
    }
}
class NonVegItem extends FoodItem implements Discountable{
    private double nonVegCharge = 20;
    public NonVegItem(String itemName, double price, int quantity){
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice(){
        return (getPrice() + nonVegCharge) * getQuantity() ;
    }
    public double applyDiscount(double totalPrice){
        return totalPrice * 0.95;
    }
    public String getDiscountDetails(){
        return "5% discount applied on Non - Veg item.";
    }
}
public class OnlineFoodDeliverySystem {

    public static void processOrder(FoodItem item){
        System.out.println(item.getItemDetails());
        double total = item.calculateTotalPrice();

        if(item instanceof Discountable){
            total = ((Discountable) item).applyDiscount(total);
            System.out.println(((Discountable) item).getDiscountDetails());
        }
        System.out.println("Final Price :"+total);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        FoodItem item1 = new VegItem("Veg Burger", 200, 2);
        FoodItem item2 = new NonVegItem("Chicken Roll", 100, 1);

        System.out.println("-------Order Processing ---------");
        processOrder(item1);
        processOrder(item2);
    }    
}