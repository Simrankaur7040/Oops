interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle implements Insurable{
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public double getRentalRate(){
        return rentalRate;
    }
    public String getInsurancePolicyNumber(){
        return insurancePolicyNumber;
    }
    public void setInsurancePolicyNumber(String insurancePolicyNumber){
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    public abstract double calculateRentalCost(int days);

    public void displayDetails(int days){
        System.out.println("----------------------");
        System.out.println("Vehicle Number :"+vehicleNumber);
        System.out.println("Vehicle Type :"+type);
        System.out.println("Rental Rate :"+rentalRate);
        System.out.println("Rental Cost for "+ days + " days :"+calculateRentalCost(days));
        System.out.println("Insurance Cost :"+calculateInsurance());
        System.out.println("Insurance Details :"+getInsuranceDetails());
        System.out.println("------------------------");
    }
}

class Car extends Vehicle{
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber){
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }
    public double calculateRentalCost(int days){
        return getRentalRate() * days;
    }
    public double calculateInsurance(){
        return 500.0;
    }
    public String getInsuranceDetails(){
        return "Car Insurance Policy :"+ getInsurancePolicyNumber();
    }
}
class Bike extends Vehicle{
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber){
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }
    public double calculateRentalCost(int days){
        return getRentalRate() * days;
    }
    public double calculateInsurance(){
        return 300.0;
    }
    public String getInsuranceDetails(){
        return "Bike Insurance Policy :"+ getInsurancePolicyNumber();
    }
}
class Truck extends Vehicle{
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber){
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }
    public double calculateRentalCost(int days){
        return getRentalRate() * days;
    }
    public double calculateInsurance(){
        return 200.0;
    }
    public String getInsuranceDetails(){
        return "Truck Insurance Policy :"+ getInsurancePolicyNumber();
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args){
        int rentalDays = 5;
        Vehicle[] vehicles = {
            new Car("CAR123", 1000, "CARINS123"),
            new Bike("BIKE234", 300, "BIKE234"),
            new Truck("TRUCK345", 2000, "TRUCK345")
        };
        System.out.println("----Vehicle Rental System -----");
        for(Vehicle v : vehicles){
            v.displayDetails(rentalDays);
        }
    }
}