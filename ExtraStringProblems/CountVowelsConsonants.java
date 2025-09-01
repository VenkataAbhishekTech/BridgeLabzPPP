package ExtraStringProblems;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String st = sc.next();
        int vowels=0,consonants=0;

        for(int i=0;i<st.length();i++){
            char ch =st.charAt(i);
            if(Character.isLetter(ch)){
                if("AEIOUaeiou".indexOf(ch) != -1){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        sc.close();
    }
}
