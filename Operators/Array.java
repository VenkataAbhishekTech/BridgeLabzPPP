package Operators;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = src.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = src.nextInt();
            sum += arr[i];
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum of array elements = " + sum);

        System.out.println("Prime numbers in the array are:");
        for (int i = 0; i < size; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }

        src.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
