package Methods.Level1;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int calculateSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum = calculateSum(n);

        System.out.print("The sum of first "+ n + " natural number is: "+sum);
        sc.close();
    }
}
