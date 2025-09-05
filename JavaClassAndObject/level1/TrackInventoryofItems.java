package JavaClassAndObject.level1;
import java.util.Scanner;
class Item {
    String name;
    int id;
    int quantity;
    double price;

    Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Name   : " + name);
        System.out.println("Item ID     : " + id);
        System.out.println("Quantity    : " + quantity);
        System.out.println("Price       : $" + price);
        System.out.println("Total Value : $" + (quantity * price));
    }
}
public class TrackInventoryofItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter item ID: ");
        int itemId = sc.nextInt();

        System.out.print("Enter item quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter item price: ");
        double price = sc.nextDouble();

        Item item = new Item(itemName, itemId, quantity, price);
        item.displayDetails();
        sc.close();
    }
}
