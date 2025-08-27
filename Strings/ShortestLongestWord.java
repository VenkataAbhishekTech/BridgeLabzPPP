package Strings;

import java.util.Scanner;

public class ShortestLongestWord {
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

    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestAndLongest(String[][] table) {
        int minIndex = 0, maxIndex = 0;
        int minLen = Integer.parseInt(table[0][1]);
        int maxLen = minLen;

        for (int i = 1; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);
            if (length < minLen) {
                minLen = length;
                minIndex = i;
            }
            if (length > maxLen) {
                maxLen = length;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = manualSplit(text);
        String[][] table = wordsWithLengths(words);
        int[] result = findShortestAndLongest(table);

        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }

        System.out.println("\nShortest word: " + table[result[0]][0] + " (Length " + table[result[0]][1] + ")");
        System.out.println("Longest word: " + table[result[1]][0] + " (Length " + table[result[1]][1] + ")");
        sc.close();
    }
}
