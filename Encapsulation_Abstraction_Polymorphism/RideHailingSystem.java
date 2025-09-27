interface GPS{
    String getCurrentLocation();
    void updateLocation(String newlocation);
}
abstract class Vehicle implements GPS{
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String location){
        this.vehicleId= vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = location;
    }
    public abstract double calculateFare(double distance);
    public void getVehicleDetails(){
        System.out.println("Vehicle ID :"+vehicleId);
        System.out.println("Driver Name :"+driverName);
        System.out.println("Rate Per Km :"+ratePerKm);
        System.out.println("Current Location :"+currentLocation);
    }
    public String getDriverName(){
        return driverName;
    }
    public void setDriverName(String driverName){
        this.driverName = driverName;
    }
    public double getRatePerKm(){
        return ratePerKm;
    }
    public void setRatePerKm(double ratePerKm){
        this.ratePerKm = ratePerKm;
    }
    public String getCurrentLocation(){
        return currentLocation;
    }
    public void updateLocation(String newLocation){
        this.currentLocation = newLocation;
    }

}
class Car extends Vehicle{
    
    public Car(String vehicleId, String driverName, double ratePerKm, String location){
        super(vehicleId, driverName, ratePerKm, location);
    }
    @Override
    public double calculateFare(double distance){
        double baseFare = 30;
        return baseFare + (distance * getRatePerKm());
    }
}
class Bike extends Vehicle{

    public Bike(String vehicleId, String driverName, double ratePerKm, String location){
        super(vehicleId, driverName, ratePerKm, location);
    }
    public double calculateFare(double distance){
        return distance * getRatePerKm();
    }
}
class Auto extends Vehicle{

    public Auto(String vehicleId, String driverName, double ratePerKm, String location){
        super(location, driverName, ratePerKm, location);
    }
    public double calculateFare(double distance){
        double minFare = 30;
        double fare = distance * getRatePerKm();
        return (fare < minFare) ? minFare :fare;
    }
}
public class RideHailingSystem {
    public static  void showFare(Vehicle v, double distance){
        v.getVehicleDetails();
        System.out.println("Distance :"+distance+ " km");
        System.out.println("Fare :"+v.calculateFare(distance));
        System.out.println("------------------");
    }
    public static void main(String[] args) {
            Vehicle car = new Car("S01", "Ramesh", 15.0, "MG Road");
            Vehicle bike = new Bike("A02", "Rajesh", 7.0, "Brigade Road");
            Vehicle auto = new Auto("To3", "Mahesh", 10.0, "Koramangala");

            showFare(car, 10);
            showFare(bike,10);
            showFare(auto,2);

            car.updateLocation("Electronic City");
            System.out.println("Updated Car Location :"+car.getCurrentLocation());
        
    }
}