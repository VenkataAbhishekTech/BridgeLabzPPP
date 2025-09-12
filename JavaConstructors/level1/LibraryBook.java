package JavaConstructors.level1;

import java.util.Scanner;

public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    // Default constructor
    LibraryBook() {
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
        available = true;
    }

    // Parameterized constructor
    LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is already borrowed.");
        }
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryBook b1 = new LibraryBook();
        System.out.println("Book 1 (Default Constructor):");
        b1.display();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        LibraryBook b2 = new LibraryBook(title, author, price, true);
        System.out.println("\nBook 2 (User Provided):");
        b2.display();

        System.out.println("Trying to borrow Book 2...");
        b2.borrowBook();

        System.out.println("Trying again to borrow Book 2...");
        b2.borrowBook();

        sc.close();
    }
}
