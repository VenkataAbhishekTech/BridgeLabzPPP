package Strings;

import java.util.Scanner;

public class CompareStrings {
    public static boolean compareUsingCharAt(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for (int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter string1: ");
        String str1 = src.next();

        System.out.print("Enter string2: ");
        String str2 = src.next();

        boolean resultCharAt = compareUsingCharAt(str1,str2);
        boolean resultEquals = str1.equals(str2);

        System.out.println("Comparison using charAt(): " + resultCharAt);
        System.out.println("Comparison using equals(): " + resultEquals);

        if (resultCharAt == resultEquals) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results are different.");
        }

        src.close();
    }
}
