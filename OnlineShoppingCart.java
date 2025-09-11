import java.util.Scanner;

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean moreCustomers = true;  // while loop condition

        while (moreCustomers) {
            int total = 0;

            // Show product menu
            System.out.println("\n--- Online Shopping Menu ---");
            System.out.println("1. Mobile Phone - ₹15000");
            System.out.println("2. Laptop - ₹40000");
            System.out.println("3. Headphones - ₹2000");
            System.out.println("4. Smartwatch - ₹5000");
            System.out.println("5. Shoes - ₹2500");

            int products;  
            // Ensure customer adds at least 1 product
            do {
                System.out.print("Enter how many products you want to buy (at least 1): ");
                products = sc.nextInt();
            } while (products < 1);

            // Customer adds items using for loop
            for (int i = 1; i <= products; i++) {
                System.out.print("Enter product number (1-5): ");
                int choice = sc.nextInt();
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();

                switch (choice) {
                    case 1: total += 15000 * qty; break;
                    case 2: total += 40000 * qty; break;
                    case 3: total += 2000 * qty; break;
                    case 4: total += 5000 * qty; break;
                    case 5: total += 2500 * qty; break;
                    default: System.out.println("Invalid choice!");
                }
            }

            // Apply discount
            if (total > 5000) {
                System.out.println("Congrats! You got 10% discount.");
                total = total - (total / 10);
            }

            System.out.println("Final Bill = ₹" + total);

            // Next customer?
            System.out.print("\nNext customer? (yes/no): ");
            String ans = sc.next();
            if (!ans.equalsIgnoreCase("yes")) {
                moreCustomers = false;
            }
        }

        sc.close();
        System.out.println("Shopping system closed.");
    }
}
