package Strings.Level2;
import java.util.Scanner;
public class StringLengthWithoutLengthMethod {
    public static int getLength(String text) {
        int count = 0;
        try {
            while(true) {
                text.charAt(count);
                count++;
            }
        } catch(Exception e) {
            // End of string
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        int manualLength = getLength(text);
        int builtinLength = text.length();
        System.out.println("Manual length: " + manualLength);
        System.out.println("Built-in length: " + builtinLength);
        sc.close();
    }
}
