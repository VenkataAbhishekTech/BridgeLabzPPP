package Methods.Level1;

import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   
        int remainder = number % divisor;  

        return new int[]{remainder, quotient}; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        if (numberOfChildren == 0) {
            System.out.println("Chocolates cannot be divided among 0 children!");
        } else {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            System.out.println("Each child will get " + result[1] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[0]);
        }

        sc.close();
    }
}
