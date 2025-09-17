// 4 Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        this.guestName = "simran";
        this.roomType = "Standard";
        this.nights = 1;
    }
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking customBooking = new HotelBooking("Alice", "Deluxe", 3);
        HotelBooking copyBooking = new HotelBooking(customBooking);

        System.out.println("Default Booking:");
        defaultBooking.display();

        System.out.println("Custom Booking:");
        customBooking.display();

        System.out.println("Copy Booking:");
        copyBooking.display();
    }
}
