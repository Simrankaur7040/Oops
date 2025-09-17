//6 Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost.

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;
    CarRental() {
        customerName = "Simran";
        carModel = "Toyota";
        rentalDays = 0;
        costPerDay = 0;
    }

    CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    
    void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost per Day: " + costPerDay);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {

        CarRental rental1 = new CarRental("John Doe", "Toyota Corolla", 5, 1200);
        rental1.displayDetails();

        System.out.println();

        CarRental rental2 = new CarRental("Alice", "Honda City", 3, 1500);
        rental2.displayDetails();
    }
}
