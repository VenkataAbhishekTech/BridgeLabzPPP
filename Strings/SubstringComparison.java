package Strings;

import java.util.Scanner;

public class SubstringComparison {
        public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);  
        }
        return result;
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String customSub = customSubstring(text, start, end);

        String builtinSub = text.substring(start, end);

        boolean comparisonResult = compareUsingCharAt(customSub, builtinSub);

        System.out.println("Substring using custom method: " + customSub);
        System.out.println("Substring using built-in method: " + builtinSub);
        System.out.println("Are both substrings equal? " + comparisonResult);

        sc.close();
    }
}
