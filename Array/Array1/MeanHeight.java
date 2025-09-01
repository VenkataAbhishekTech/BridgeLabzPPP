// ...existing code...
package Array.Array1;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        double[] height = new double[11];
        double sum=0.0;

        System.out.print("Enter the heights of 11 players: ");
        for(int i=0;i<height.length;i++){
            System.out.println("\nplayer " + (i+1) + " height: ");
            height[i] = src.nextDouble();
            sum += height[i];
        }
        double mean = sum/height.length;
        System.out.println("\nMean height of football team is: "+ mean);

        src.close();
    }
}
