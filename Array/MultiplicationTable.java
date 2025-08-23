package Array;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = src.nextInt();

        int[] table = new int[10];

        for(int i=1;i<=10;i++){
            table[i-1] = num*i;
        }

        System.out.println("Multiplicaton Tabel of " + num + "is: ");
        for(int i=1;i<=10;i++){
            System.out.println(num + " * " + i + " = " + table[i-1]);
        }
        src.close();
    }
}
