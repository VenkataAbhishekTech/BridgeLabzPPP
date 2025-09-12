package JavaConstructors.level1;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b1 = new Book();
        System.out.println("Book 1 (Default Constructor):");
        b1.display();

        System.out.println("\nEnter details for Book 2:");
        System.out.print("Enter Title: ");
        String t = sc.nextLine();

        System.out.print("Enter Author: ");
        String a = sc.nextLine();

        System.out.print("Enter Price: ");
        double p = sc.nextDouble();

        Book b2 = new Book(t, a, p);

        System.out.println("\nBook 2 (Parameterized Constructor):");
        b2.display();

        sc.close();
    }
}
