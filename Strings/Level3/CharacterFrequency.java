package Strings.Level3;
import java.util.Scanner;
public class CharacterFrequency {
    public static String[][] getCharFrequency(String text) {
        int[] freq = new int[256];
        for(int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        boolean[] added = new boolean[256];
        int count = 0;
        for(int i = 0; i < text.length(); i++) {
            if(!added[text.charAt(i)]) {
                count++;
                added[text.charAt(i)] = true;
            }
        }
        String[][] result = new String[count][2];
        int idx = 0;
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(added[ch]) {
                result[idx][0] = String.valueOf(ch);
                result[idx][1] = String.valueOf(freq[ch]);
                added[ch] = false;
                idx++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] freq = getCharFrequency(text);
        System.out.println("Char\tFrequency");
        for(String[] row : freq) {
            System.out.println(row[0] + "\t" + row[1]);
        }
        sc.close();
    }
}
