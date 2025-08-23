package Array;

import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = src.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = src.nextDouble();
        }

        int minAgeIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        int maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Youngest Friend: " + names[minAgeIndex] + " (Age: " + ages[minAgeIndex] + ")");
        System.out.println("Tallest Friend: " + names[maxHeightIndex] + " (Height: " + heights[maxHeightIndex] + " cm)");

        src.close();
    }
}
