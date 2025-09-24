class Vehicle{
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo(){
        System.out.println("Maximum Speed :"+maxSpeed+ " km/h");
        System.out.println("Fuel Type :"+fuelType);
    }
}
class Car extends Vehicle{
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity =seatCapacity;
    }
}
class Truck extends Vehicle{
    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity){
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity :"+loadCapacity+ "tons");
    }
}

class Motorcycle extends Vehicle{
    boolean hasGear;

    public Motorcycle() {
        super(0, null);
    }

    public Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Has Gear :"+(hasGear ? "Yes":"No"));
    }
}

public class VehicleHierarchy{
    public static void main(String[] args){
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(100, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15);
        vehicles[2] = new Motorcycle(150, "Petrol", true);

        for (int i = 0; i <vehicles.length; i++) {
            System.out.println("\n --------Vehicle "+ (i+1)+"-----");
            vehicles[i].displayInfo();
            System.out.println();
        }
    }
}