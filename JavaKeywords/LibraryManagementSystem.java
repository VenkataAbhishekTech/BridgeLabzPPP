package JavaKeywords;

import java.util.Scanner;
class Book {
    static String libraryName = "City Library";
    final String isbn;
    String title;
    String author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter ISBN: ");
            String isbn = sc.nextLine();
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            books[i] = new Book(isbn, title, author);
        }

        Book.displayLibraryName();
        for (Book b : books) {
            b.displayDetails();
            System.out.println("-----------------");
        }
        sc.close();
    }
}
