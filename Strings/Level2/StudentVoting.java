package Strings.Level2;
import java.util.Scanner;
import java.util.Random;
public class StudentVoting {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for(int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // 2-digit age
        }
        return ages;
    }
    public static String[][] votingTable(int[] ages) {
        String[][] arr = new String[ages.length][2];
        for(int i = 0; i < ages.length; i++) {
            arr[i][0] = String.valueOf(ages[i]);
            arr[i][1] = (ages[i] >= 18 && ages[i] > 0) ? "Can Vote" : "Cannot Vote";
        }
        return arr;
    }
    public static void displayTable(String[][] arr) {
        System.out.println("Age\tVoting Eligibility");
        for(String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = generateAges(n);
        String[][] table = votingTable(ages);
        displayTable(table);
        sc.close();
    }
}
