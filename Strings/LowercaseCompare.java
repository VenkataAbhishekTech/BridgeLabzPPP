package Strings;

import java.util.Scanner;

public class LowercaseCompare {
    public static String toLowerCaseManual(String text){
        String result = "";
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch>='A' && ch<='Z'){
                result +=(char)(ch+32);
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

        String manual = toLowerCaseManual(text);
        String builtIn = text.toLowerCase();

        boolean result = compareStrings(manual, builtIn);

        System.out.println("Manual lowercase: " + manual);
        System.out.println("Built-in lowercase: " + builtIn);
        System.out.println("Both are equal: " + result);
        src.close();
    }
}
