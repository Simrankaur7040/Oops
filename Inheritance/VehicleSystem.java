class Vehicle{
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    void displayDetails(){
        System.out.println("Max Speed :"+maxSpeed + " km/h");
        System.out.println("Model :"+model);
    }
}
interface Refuelable{
    void refuel();
}
class ElectricVehicle extends Vehicle{
    int batteryCapacity;

    ElectricVehicle(int maxSpeed, String model, int batteryCapacity){
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }
    void charge(){
        System.out.println("Role: Electric Vehicle");
        displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging the electric vehicle...");
        System.out.println("------------------------");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable{
    int fuelCapacity;
    PetrolVehicle(int maxSpeed, String model, int fuelCapacity){
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }
    public void refuel() {
        System.out.println("Role: Petrol Vehicle");
        displayDetails();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Refueling the petrol vehicle...");
        System.out.println("------------------------");
    }
}
public class VehicleSystem {
    public static void main(String[] args){
        ElectricVehicle ev = new ElectricVehicle(220, "Tesla Model 3", 75);
        PetrolVehicle pv = new PetrolVehicle(180, "Honda Civic", 45);

        ev.charge();
        pv.refuel();
    }
}