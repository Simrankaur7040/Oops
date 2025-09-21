class Vehicle {
    private  static double registerationFee = 500;
    private final String registerationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registerationNumber, String ownerName, String vehicleType){
        this.registerationNumber =  registerationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayVehicleDetails(){
        if(this instanceof Vehicle){
            System.out.println("--------------------------------");
            System.out.println("Registeration Number :"+registerationNumber);
            System.out.println("Owner Name :"+ownerName);
            System.out.println("Vehicle Type :"+vehicleType);
            System.out.println("Registeration Fee : Rs."+registerationFee);
            System.out.println("--------------------------------");
        }
    }
    public static void updateRegisterationFee(double newFee){
        registerationFee = newFee;
    }
}
public class VehicleSystem{
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("ABC234", "Sakshi", "Car");
        Vehicle vehicle2 = new Vehicle("OPL567", "piya","Motorcycle");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        Vehicle.updateRegisterationFee(800);
        System.out.println("Registeration Fee updated.");
    }
}