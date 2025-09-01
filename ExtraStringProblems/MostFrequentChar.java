package ExtraStringProblems;
import java.util.Scanner;
public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        int maxFreq = 0;
        char mostFrequentChar = ' ';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFrequentChar = (char) i;
            }
        }

        System.out.println("Most frequent character: " + mostFrequentChar);
        sc.close();
    }
}
