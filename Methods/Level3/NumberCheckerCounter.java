package Methods.Level3;

import java.util.Arrays;

public class NumberCheckerCounter {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }
    public static int[] reverseDigits(int[] digits) {
        int n = digits.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = digits[n - 1 - i];
        }
        return reversed;
    }
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] reversed = reverseDigits(digits);
        return arraysEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int num) {
        String s = String.valueOf(num);
        return s.contains("0") && s.charAt(0) != '0';
    }
    public static void main(String[] args) {
        int number = 12021;

        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));

        boolean equalCheck = arraysEqual(digits, reversed);
        System.out.println("Digits equal to reversed? " + equalCheck);

        boolean palindrome = isPalindrome(number);
        System.out.println("Is Palindrome Number: " + palindrome);

        boolean duck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + duck);
    }
}
