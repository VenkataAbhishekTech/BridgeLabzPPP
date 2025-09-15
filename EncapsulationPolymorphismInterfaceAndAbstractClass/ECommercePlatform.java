// Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Abstract method for discount calculation
    public abstract double calculateDiscount();
}

// Interface Taxable
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics class
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.1; }  
    public double calculateTax() { return getPrice() * 0.18; }         public String getTaxDetails() { return "18% GST"; }
}

// Clothing class
class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.2; }  
    public double calculateTax() { return getPrice() * 0.05; }     
    public String getTaxDetails() { return "5% GST"; }
}

// Groceries class (no tax)
class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.05; } 
}

// Main class to test
public class ECommercePlatform {
    public static void printFinalPrice(Product p) {
        double discount = p.calculateDiscount();
        double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
        double finalPrice = p.getPrice() + tax - discount;
        System.out.println(p.getName() + " | Final Price: " + finalPrice);
    }

    public static void main(String[] args) {
        Product p1 = new Electronics(1, "Laptop", 60000);
        Product p2 = new Clothing(2, "Shirt", 2000);
        Product p3 = new Groceries(3, "Apples", 500);

        Product[] products = {p1, p2, p3};
        for (Product p : products) printFinalPrice(p);
    }
}
