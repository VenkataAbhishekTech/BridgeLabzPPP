package Strings.Level3;
import java.util.Scanner;
public class CharFrequencyWithUnique {
    public static String[] getCharFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        for(int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            if(chars[i] == '0') continue;
            for(int j = i + 1; j < chars.length; j++) {
                if(chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        int count = 0;
        for(int i = 0; i < chars.length; i++) if(chars[i] != '0') count++;
        String[] result = new String[count];
        int idx = 0;
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] != '0') {
                result[idx++] = chars[i] + " - " + freq[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] freq = getCharFrequency(text);
        System.out.println("Char - Frequency");
        for(String s : freq) System.out.println(s);
        sc.close();
    }
}
