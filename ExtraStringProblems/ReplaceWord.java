package ExtraStringProblems;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = sc.nextLine();

        String modified = "";
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                words[i] = newWord;
            }
            modified += words[i] + " ";
        }

        System.out.println("Modified Sentence: " + modified.trim());
        sc.close();
    }
}
