package ControlFlow;

import java.util.Scanner;

public class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int counter = 100;

            while (counter > 0) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Please enter a positive number less than 100.");
        }
        sc.close();
    }
}

