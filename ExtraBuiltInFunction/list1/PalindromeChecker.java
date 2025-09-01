package ExtraBuiltInFunction.list1;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        String text = getInput();
        boolean result = isPalindrome(text);
        displayResult(text, result);
    }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        return str;
    }
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(String text, boolean isPal) {
        if (isPal) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}
