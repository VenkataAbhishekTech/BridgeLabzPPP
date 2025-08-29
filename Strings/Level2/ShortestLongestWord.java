package Strings.Level2;
import java.util.Scanner;
public class ShortestLongestWord {
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
    public static int[] shortestLongest(String[][] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minIdx = -1, maxIdx = -1;
        for(int i = 0; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if(len < min) { min = len; minIdx = i; }
            if(len > max) { max = len; maxIdx = i; }
        }
        return new int[]{minIdx, maxIdx};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = splitManual(text);
        String[][] arr = wordsWithLength(words);
        int[] idxs = shortestLongest(arr);
        System.out.println("Shortest word: " + arr[idxs[0]][0] + " (" + arr[idxs[0]][1] + ")");
        System.out.println("Longest word: " + arr[idxs[1]][0] + " (" + arr[idxs[1]][1] + ")");
        sc.close();
    }
}
