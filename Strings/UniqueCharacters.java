package Strings;

import java.util.Scanner;

public class UniqueCharacters {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static char[] findUnique(String text) {
        int n = findLength(text);
        char[] unique = new char[n]; 
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[uniqueCount] = ch;
                uniqueCount++;
            }
        }
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char[] uniqueChars = findUnique(text);
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        sc.close();
    }
}
