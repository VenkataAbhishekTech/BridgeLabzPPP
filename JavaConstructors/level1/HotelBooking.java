package JavaConstructors.level1;
import java.util.Scanner;
public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking 1 (Default Constructor):");
        booking1.display();

        System.out.println("\nEnter details for Booking 2:");
        System.out.print("Enter Guest Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Room Type: ");
        String room = sc.nextLine();

        System.out.print("Enter Number of Nights: ");
        int nights = sc.nextInt();

        HotelBooking booking2 = new HotelBooking(name, room, nights);
        System.out.println("\nBooking 2 (Parameterized Constructor):");
        booking2.display();
        sc.close();
    }
}
