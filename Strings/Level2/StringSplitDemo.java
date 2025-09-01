package Strings.Level2;

import java.util.Scanner;

public class StringSplitDemo {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] manualSplit(String text) {
        int length = getLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }
        String[] words = new String[wordCount];
        int wordIndex = 0;
        String currentWord = "";
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words[wordIndex++] = currentWord;
                currentWord = "";
            } else {
                currentWord += ch;
            }
        }
        words[wordIndex] = currentWord;
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] manualWords = manualSplit(text);
        String[] builtInWords = text.split(" ");

        boolean areEqual = compareArrays(manualWords, builtInWords);

        System.out.println("Manual split:");
        for (String w : manualWords) System.out.println(w);

        System.out.println("Built-in split:");
        for (String w : builtInWords) System.out.println(w);

        System.out.println("Both are equal: " + areEqual);
        sc.close();
    }
}
