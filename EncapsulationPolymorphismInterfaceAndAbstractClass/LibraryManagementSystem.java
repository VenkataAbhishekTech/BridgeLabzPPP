package EncapsulationPolymorphismInterfaceAndAbstractClass;

import java.util.ArrayList;
import java.util.List;

abstract class LibraryItem {
    public String itemId;
    public String title;
    public String author;
    public String borrower;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrower = null;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getBorrower() { return borrower; }
    protected void setBorrower(String borrower) { this.borrower = borrower; }

    public String getItemDetails() {
        return "ID: " + itemId + " | Title: " + title + " | Author: " + author;
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() { return 14; }

    public void reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            setBorrower(borrowerName);
            System.out.println(getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println(getTitle() + " is already reserved.");
        }
    }

    public boolean checkAvailability() { return !reserved; }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() { return 7; }

    public void reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            setBorrower(borrowerName);
            System.out.println(getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println(getTitle() + " is already reserved.");
        }
    }

    public boolean checkAvailability() { return !reserved; }
}

class DVD extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() { return 3; }

    public void reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            setBorrower(borrowerName);
            System.out.println(getTitle() + " reserved by " + borrowerName);
        } else {
            System.out.println(getTitle() + " is already reserved.");
        }
    }

    public boolean checkAvailability() { return !reserved; }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B101", "Java Programming", "James Gosling"));
        items.add(new Magazine("M202", "Tech Monthly", "Editor Team"));
        items.add(new DVD("D303", "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails() + " | Loan Duration: " + item.getLoanDuration() + " days");
            Reservable res = (Reservable) item;
            System.out.println("Available: " + res.checkAvailability());
            res.reserveItem("Alice");
            System.out.println("Available after reserve: " + res.checkAvailability());
            System.out.println();
        }
    }
}
