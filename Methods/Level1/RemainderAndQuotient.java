package Methods.Level1;

import java.util.Scanner;

public class RemainderAndQuotient {
    public static int[] findRemainderAndQuotient(int num,int divisor){
        int Quotient = num/divisor;
        int Remainder = num%divisor;

        return new int[]{Remainder,Quotient};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        int[] result = findRemainderAndQuotient(num, divisor);

        System.out.println("Quotient = " + result[1]);
        System.out.println("Remainder = " + result[0]);

        sc.close();
    }
}
