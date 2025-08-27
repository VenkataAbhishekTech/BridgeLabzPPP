package Strings;

import java.util.Scanner;

public class TrimString  {
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }
    public static String substringManual(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the string with space: ");
        String text = src.nextLine();

        int[] indexes = findTrimIndexes(text);

        String manualTrim = substringManual(text, indexes[0], indexes[1]);

        String builtinTrim = text.trim();

        boolean isSame = compareStrings(manualTrim, builtinTrim);

        System.out.println("Manual Trim Result   : '" + manualTrim + "'");
        System.out.println("Built-in Trim Result : '" + builtinTrim + "'");
        System.out.println("Are both same? " + isSame);
        src.close();
    }
}
