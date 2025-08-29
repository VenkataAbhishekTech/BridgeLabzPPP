package Strings.Level2;

import java.util.Scanner;

public class VotingEligibility {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
        }
        System.out.printf("%-10s %-15s\n", "Age", "Can Vote?");
        System.out.println("---------------------------");

        for (int i = 0; i < 10; i++) {
            if (ages[i] >= 18) {
                System.out.printf("%-10d %-15s\n", ages[i], "true");
            } else {
                System.out.printf("%-10d %-15s\n", ages[i], "false");
            }
        }
        sc.close();
    }
}
