package ExtraBuiltInFunction.list1;

import java.util.Scanner;

public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
       int a =getInput("Enter the first number: ");
       int b = getInput("Enter the second number: ");
       int c = getInput("Enter the third number: ");
       int max = findMaximum(a, b, c);
       System.out.println("The maximum number is: " + max);
    }
    public static int getInput(String message){
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        int num = sc.nextInt();
        return num;
    }
    public static int findMaximum(int a,int b, int c){
        if(a>=b && a>=c)return a;
        else if(b>=a && b>=c)return b;
        else return c;
    }
}
