package Strings.Level1;
import java.util.Scanner;
public class SubstringComparison {
    public static String substringByCharAt(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < end; i++) {
            sb.append(text.charAt(i));
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
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String sub1 = substringByCharAt(text, start, end);
        String sub2 = text.substring(start, end);
        boolean compare = compareByCharAt(sub1, sub2);
        System.out.println("Substring by charAt: " + sub1);
        System.out.println("Substring by substring(): " + sub2);
        System.out.println("Are both substrings equal? " + compare);
        sc.close();
    }
}
