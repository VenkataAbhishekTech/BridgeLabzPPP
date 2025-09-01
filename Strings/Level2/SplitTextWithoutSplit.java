package Strings.Level2;
import java.util.Scanner;
import java.util.Arrays;
public class SplitTextWithoutSplit {
    public static int getLength(String text) {
        int count = 0;
        try {
            while(true) {
                text.charAt(count);
                count++;
            }
        } catch(Exception e) {}
        return count;
    }
    public static String[] splitManual(String text) {
        int len = getLength(text);
        int wordCount = 1;
        for(int i = 0; i < len; i++) if(text.charAt(i) == ' ') wordCount++;
        String[] words = new String[wordCount];
        int start = 0, idx = 0;
        for(int i = 0; i < len; i++) {
            if(text.charAt(i) == ' ') {
                words[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = text.substring(start, len);
        return words;
    }
    public static boolean compareArrays(String[] a, String[] b) {
        if(a.length != b.length) return false;
        for(int i = 0; i < a.length; i++) if(!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] manual = splitManual(text);
        String[] builtin = text.split(" ");
        boolean compare = compareArrays(manual, builtin);
        System.out.println("Manual split: " + Arrays.toString(manual));
        System.out.println("Built-in split: " + Arrays.toString(builtin));
        System.out.println("Are both splits equal? " + compare);
        sc.close();
    }
}
