class Order{
    int orderId;
    String orderDate;

    Order(int orderId,String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    String getOrderStatus(){
        return "Order Placed";
    }
    void displayDetails(){
        System.out.println("Order ID :"+orderId);
        System.out.println("Order Date :"+orderDate);
        System.out.println("Status :"+getOrderStatus());
    }
}
class ShippedOrder extends Order{
    String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    String getOrderStatus(){
        return "Order Shipped";
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Tracking Number :"+trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;

    DeliveredOrder(int orderId,String orderDate, String trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    String getOrderStatus(){
        return "Order Delivered";
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Delivery Date :"+deliveryDate);
    }
}
public class RetailSystem {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-09-20");
        System.out.println("----------Order Details -----------");
        order.displayDetails();

        ShippedOrder shipped = new ShippedOrder(102,"2025-09-21", "TRK3006");
        System.out.println("\n ----------Shipped Order Details ------------");
        shipped.displayDetails();

        DeliveredOrder delivered = new DeliveredOrder(103,"2025-09-22","GRG36933","2025-09-25");
        System.out.println("\n -----------Delivered Order Details ---------");
        delivered.displayDetails();
    }
}