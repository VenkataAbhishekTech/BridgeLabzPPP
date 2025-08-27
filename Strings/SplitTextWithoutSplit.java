package Strings;

import java.util.Scanner;

public class SplitTextWithoutSplit {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitText(String str) {
        int len = findLength(str);

        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaceIndexes = new int[wordCount + 1];
        int idx = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[++idx] = i;
            }
        }
        spaceIndexes[++idx] = len;

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = start; j < spaceIndexes[i + 1]; j++) {
                if (str.charAt(j) != ' ') {
                    word += str.charAt(j);
                }
            }
            words[i] = word;
            start = spaceIndexes[i + 1] + 1;
        }
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] customSplit = splitText(input);

        String[] builtInSplit = input.split(" ");

        boolean result = compareArrays(customSplit, builtInSplit);

        System.out.println("Words using user-defined method:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nComparison result: " + result);

        sc.close();
    }
}
