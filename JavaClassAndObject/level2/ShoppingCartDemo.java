package JavaClassAndObject.level2;

import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    double getTotalPrice() {
        return price * quantity;
    }
}
class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();
    void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.itemName + " added to cart.");
    }
    void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(itemName)) {
                items.remove(i);
                System.out.println(itemName + " removed from cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(itemName + " not found in cart.");
        }
    }
    void displayTotalCost() {
        double total = 0;
        System.out.println("\n----- Cart Summary -----");
        for (CartItem item : items) {
            System.out.println(item.itemName + " (x" + item.quantity + ") - " + item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: " + total);
    }
}
public class ShoppingCartDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        int choice;
        do {
            System.out.println("\n----- Shopping Cart Menu -----");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Item Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    cart.addItem(new CartItem(name, price, qty));
                    break;

                case 2:
                    System.out.print("Enter Item Name to remove: ");
                    String removeName = sc.nextLine();
                    cart.removeItem(removeName);
                    break;

                case 3:
                    cart.displayTotalCost();
                    break;

                case 4:
                    System.out.println("Exiting Shopping Cart. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
