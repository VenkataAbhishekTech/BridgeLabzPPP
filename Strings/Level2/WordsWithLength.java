package Strings.Level2;
import java.util.Scanner;
public class WordsWithLength {
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
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for(int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = splitManual(text);
        String[][] result = wordsWithLength(words);
        System.out.println("Word\tLength");
        for(String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]);
        }
        sc.close();
    }
}
