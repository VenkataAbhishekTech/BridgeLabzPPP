package EncapsulationPolymorphismInterfaceAndAbstractClass;

import java.util.ArrayList;
import java.util.List;
abstract class FoodItem {
    public String itemName;
    public double price;
    public int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    protected void setQuantity(int quantity) { this.quantity = quantity; }

    public String getItemDetails() {
        return "Item: " + itemName + " | Price: " + price + " | Quantity: " + quantity;
    }
    public abstract double calculateTotalPrice();
}
interface Discountable {
    double applyDiscount(double total);
    String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
    public double applyDiscount(double total) {
        return total * 0.9; 
    }
    public String getDiscountDetails() {
        return "10% Veg Discount";
    }
}
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50; 
    }
    public double applyDiscount(double total) {
        return total * 0.85;
    }
    public String getDiscountDetails() {
        return "15% Non-Veg Discount";
    }
}
public class OnlineFoodDeliverySystem {
    public static void processOrder(List<FoodItem> items) {
        for (FoodItem item : items) {
            double total = item.calculateTotalPrice();
            if (item instanceof Discountable) {
                total = ((Discountable)item).applyDiscount(total);
                System.out.println(item.getItemDetails() + " | Final Price: " + total + " | " + ((Discountable)item).getDiscountDetails());
            } else {
                System.out.println(item.getItemDetails() + " | Final Price: " + total);
            }
        }
    }
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala", 200, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));
        order.add(new VegItem("Veg Burger", 100, 3));

        processOrder(order);
    }
}
