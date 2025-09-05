package JavaClassAndObject.level1;
import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Book Title : " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price : $" + price);
    }
}
public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter book author: ");
        String author = sc.nextLine();
        System.out.print("Enter book price: ");
        double price = sc.nextDouble();
        Book book = new Book(title, author, price);
        book.displayDetails();
        sc.close();
    }
}
