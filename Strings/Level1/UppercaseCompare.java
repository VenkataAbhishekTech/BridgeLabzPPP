package Strings.Level1;
import java.util.Scanner;
public class UppercaseCompare {
    public static String toUpperManual(String text) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(c >= 'a' && c <= 'z') sb.append((char)(c - 32));
            else sb.append(c);
        }
        return sb.toString();
    }
    public static boolean compareByCharAt(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String manual = toUpperManual(text);
        String builtin = text.toUpperCase();
        boolean compare = compareByCharAt(manual, builtin);
        System.out.println("Manual uppercase: " + manual);
        System.out.println("Built-in uppercase: " + builtin);
        System.out.println("Are both uppercase strings equal? " + compare);
        sc.close();
    }
}
