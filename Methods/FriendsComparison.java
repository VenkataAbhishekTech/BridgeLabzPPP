package Methods;

import java.util.Scanner;

public class FriendsComparison {
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int findTallest(double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.println("Enter the ages and heights of Amar, Akbar, and Anthony:");

        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + " - Age: ");
            ages[i] = sc.nextInt();

            System.out.print(names[i] + " - Height (in cm): ");
            heights[i] = sc.nextDouble();
        }
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        System.out.println("\nResults:");
        System.out.println("Youngest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}
