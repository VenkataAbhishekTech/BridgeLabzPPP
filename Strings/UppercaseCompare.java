package Strings;

import java.util.Scanner;

public class UppercaseCompare {
    public static String toUpperCaseManual(String text){
        String result = "";
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch>='a' && ch<='z'){
                result +=(char)(ch-32);
            }else{
                result+=ch;
            }
        }
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = src.nextLine();

        String manual = toUpperCaseManual(text);
        String builtIn = text.toUpperCase();

        boolean result = compareStrings(manual, builtIn);

        System.out.println("Manual uppercase: " + manual);
        System.out.println("Built-in uppercase: " + builtIn);
        System.out.println("Both are equal: " + result);
        src.close();
    }
}
