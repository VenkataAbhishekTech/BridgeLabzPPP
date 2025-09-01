package ExtraStringProblems;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        sc.close();
    }
}
