package Strings.Level2;
import java.util.Scanner;
public class TrimString {
    public static int[] trimIndexes(String text) {
        int start = 0, end = text.length() - 1;
        while(start < text.length() && text.charAt(start) == ' ') start++;
        while(end >= 0 && text.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }
    public static String substringManual(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for(int i = start; i <= end; i++) sb.append(text.charAt(i));
        return sb.toString();
    }
    public static boolean compareManual(String a, String b) {
        if(a.length() != b.length()) return false;
        for(int i = 0; i < a.length(); i++) if(a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int[] idx = trimIndexes(text);
        String manualTrim = substringManual(text, idx[0], idx[1]);
        String builtinTrim = text.trim();
        boolean isEqual = compareManual(manualTrim, builtinTrim);
        System.out.println("Manual trim: '" + manualTrim + "'");
        System.out.println("Built-in trim: '" + builtinTrim + "'");
        System.out.println("Are both trims equal? " + isEqual);
        sc.close();
    }
}
