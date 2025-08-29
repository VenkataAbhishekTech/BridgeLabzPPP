package Strings.Level2;
import java.util.Scanner;
public class VowelConsonantCount {
    public static String checkCharType(char ch) {
        ch = (char)(ch >= 'A' && ch <= 'Z' ? ch + 32 : ch);
        if(ch >= 'a' && ch <= 'z') {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    public static int[] countVowelConsonant(String text) {
        int vowels = 0, consonants = 0;
        for(int i = 0; i < text.length(); i++) {
            String type = checkCharType(text.charAt(i));
            if(type.equals("Vowel")) vowels++;
            else if(type.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int[] result = countVowelConsonant(text);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
        sc.close();
    }
}
