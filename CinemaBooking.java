import java.util.Scanner;

public class CinemaBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean moreCustomers = true;

        while (moreCustomers) {
            int total = 0;

            // show movies
            System.out.println("\n--- Movie List ---");
            System.out.println("1. Avengers - ₹300");
            System.out.println("2. Inception - ₹250");
            System.out.println("3. KGF - ₹200");
            System.out.println("4. RRR - ₹180");
            System.out.println("5. Jawan - ₹150");

            int tickets;
            do {
                System.out.print("Enter how many movies you want to book (at least 1): ");
                tickets = sc.nextInt();
            } while (tickets < 1);

            // take booking
            for (int i = 1; i <= tickets; i++) {
                System.out.print("Enter movie number (1-5): ");
                int choice = sc.nextInt();
                System.out.print("Enter number of seats: ");
                int qty = sc.nextInt();

                switch (choice) {
                    case 1: total += 300 * qty; break;
                    case 2: total += 250 * qty; break;
                    case 3: total += 200 * qty; break;
                    case 4: total += 180 * qty; break;
                    case 5: total += 150 * qty; break;
                    default: System.out.println("Invalid choice!");
                }
            }

            // discount
            if (total > 2000) {
                System.out.println("Flat ₹200 discount applied!");
                total = total - 200;
            }

            System.out.println("Final Bill = ₹" + total);

            // next customer?
            System.out.print("\nNext customer? (yes/no): ");
            String ans = sc.next();
            if (!ans.equalsIgnoreCase("yes")) {
                moreCustomers = false;
            }
        }

        sc.close();
        System.out.println("Cinema closed.");
    }
}
