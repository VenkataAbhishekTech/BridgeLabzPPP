import java.util.Scanner;

public class CafeteriaOrderingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu Items
        String[] items = {"Burger", "Pizza", "Sandwich", "Coffee", "Juice"};
        int[] prices = {150, 300, 120, 100, 80};

        boolean moreCustomers = true;

        while (moreCustomers) {
            int total = 0;
            System.out.println("\n===== Cafeteria Menu =====");
            for (int i = 0; i < items.length; i++) {
                System.out.println((i + 1) + ". " + items[i] + " - ₹" + prices[i]);
            }

            int orderCount;
            do {
                System.out.print("\nEnter number of items to order (at least 1): ");
                orderCount = sc.nextInt();
            } while (orderCount < 1);

            // Multiple item orders
            for (int i = 0; i < orderCount; i++) {
                System.out.print("Select item (1-5): ");
                int choice = sc.nextInt();
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();

                switch (choice) {
                    case 1 -> total += prices[0] * qty;
                    case 2 -> total += prices[1] * qty;
                    case 3 -> total += prices[2] * qty;
                    case 4 -> total += prices[3] * qty;
                    case 5 -> total += prices[4] * qty;
                    default -> System.out.println("Invalid choice!");
                }
            }

            // Apply discount
            if (total > 1500) {
                System.out.println("10% discount applied!");
                total -= total * 0.1;
            }

            System.out.println("Total Bill: ₹" + total);

            // Next customer?
            System.out.print("\nServe next customer? (yes/no): ");
            String ans = sc.next();
            if (!ans.equalsIgnoreCase("yes")) {
                moreCustomers = false;
            }
        }

        sc.close();
        System.out.println("Cafeteria closed for the day!");
    }
}
