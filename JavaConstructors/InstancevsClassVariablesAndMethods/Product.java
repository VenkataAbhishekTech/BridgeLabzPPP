package JavaConstructors.InstancevsClassVariablesAndMethods;

import java.util.Scanner;

public class Product {
    String productName;
    double price;

    static int totalProducts = 0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("---------------------------");
    }

    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products to add: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");

            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            sc.nextLine(); 

            products[i] = new Product(name, price);
        }

        System.out.println("\n=== Product Details ===");
        for (Product p : products) {
            p.displayProductDetails();
        }
        Product.displayTotalProducts();

        sc.close();
    }
}
