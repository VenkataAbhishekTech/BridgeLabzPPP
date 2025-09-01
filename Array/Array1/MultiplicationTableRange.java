package Array.Array1;

import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number(6-9): ");
        int num = sc.nextInt();

        int[] multiplicationResult = new int[10];

        if(num<6 || num>9){
            System.out.println("please enter number between 6 and 9.");
            return;
        }
        for(int i=1;i<=10;i++){
            multiplicationResult[i-1] = num*i;
        }

        System.out.println("Multiplication tabel of " + num + "is : ");
        for(int i = 1;i<=10;i++){
            System.out.println(num + " * " + i + " = " + multiplicationResult[i-1]);
        }
        sc.close();
    }
}
