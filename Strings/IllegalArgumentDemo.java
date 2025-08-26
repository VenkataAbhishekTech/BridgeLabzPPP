package Strings;

import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String text) {
        System.out.println("Substring: " + text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Start index cannot be greater than end index!");
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\nCalling generateException()...");
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("\nCalling handleException()...");
        handleException(input);
        sc.close();
    }
}
