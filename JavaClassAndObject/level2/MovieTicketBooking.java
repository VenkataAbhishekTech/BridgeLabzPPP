package JavaClassAndObject.level2;
import java.util.Scanner;
class TicketBooking {
    String movieName;
    int numberOfTickets;
    double pricePerTicket;

    TicketBooking(String movieName, int numberOfTickets, double pricePerTicket) {
        this.movieName = movieName;
        this.numberOfTickets = numberOfTickets;
        this.pricePerTicket = pricePerTicket;
         System.out.println("Ticket booked successfully!");
    }

    double calculateTotalCost() {
        return numberOfTickets * pricePerTicket;
    }

    void displayBookingDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Price per Ticket: " + pricePerTicket);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}
public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();
        System.out.print("Enter Number of Tickets: ");
        int numberOfTickets = sc.nextInt();
        System.out.print("Enter Price per Ticket: ");
        double pricePerTicket = sc.nextDouble();
        TicketBooking booking = new TicketBooking(movieName, numberOfTickets, pricePerTicket);
        booking.displayBookingDetails();
        sc.close();
    }
}
