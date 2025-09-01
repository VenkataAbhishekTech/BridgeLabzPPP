package ControlFlow.Level2;
import java.util.Scanner;
public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Amar: ");
        int age1 = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int age2 = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int age3 = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        double h1 = sc.nextDouble();
        System.out.print("Enter height of Akbar: ");
        double h2 = sc.nextDouble();
        System.out.print("Enter height of Anthony: ");
        double h3 = sc.nextDouble();
        int youngest = (age1 < age2 && age1 < age3) ? age1 : (age2 < age3 ? age2 : age3);
        double tallest = (h1 > h2 && h1 > h3) ? h1 : (h2 > h3 ? h2 : h3);
        System.out.println("Youngest age: " + youngest);
        System.out.println("Tallest height: " + tallest);
        sc.close();
    }
}
