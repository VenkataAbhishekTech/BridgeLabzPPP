package Inheritance.SingleInheritance;
import java.util.Scanner;
class Book{
    String title;
    int publicationYear;

    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
    void displayInfo(){
        System.out.println("Title: "+title);
        System.out.println("Publication Year: "+publicationYear);
    }
}

class Author extends Book{
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author Name: "+name);
        System.out.println("Author Bio: "+bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter publication year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter author name: ");
        String name = sc.nextLine();
        System.out.print("Enter author bio: ");
        String bio = sc.nextLine();
        Author a = new Author(title, year, name, bio);
        a.displayInfo();
        sc.close();
    }
}
