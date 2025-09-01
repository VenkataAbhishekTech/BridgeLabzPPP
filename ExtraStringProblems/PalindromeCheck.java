package ExtraStringProblems;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        String reverse = "";
        for (int i=0;i<str.length();i++){
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }
}
