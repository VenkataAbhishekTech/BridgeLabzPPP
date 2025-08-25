package Strings;

import java.util.Scanner;

public class StringToCharArray {
    public static char[] manualToCharArray(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] arr1 = manualToCharArray(text);
        char[] arr2 = text.toCharArray();

        boolean result = compareCharArrays(arr1, arr2);

        System.out.println("Manual toCharArray: ");
        for (char c : arr1) {
            System.out.print(c + " ");
        }
        System.out.println("\nBuilt-in toCharArray: ");
        for (char c : arr2) {
            System.out.print(c + " ");
        }
        System.out.println("\nBoth arrays are equal: " + result);
        sc.close();
    }
}
