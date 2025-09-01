package Strings.Level2;
import java.util.Scanner;
import java.util.Random;
public class StudentMarks {
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for(int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Physics
            scores[i][1] = rand.nextInt(41) + 60; // Chemistry
            scores[i][2] = rand.nextInt(41) + 60; // Math
        }
        return scores;
    }
    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for(int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = Math.round((total / 300.0) * 10000.0) / 100.0;
            stats[i][0] = total;
            stats[i][1] = avg;
            stats[i][2] = percent;
        }
        return stats;
    }
    public static String[] calculateGrade(double[] percent) {
        String[] grades = new String[percent.length];
        for(int i = 0; i < percent.length; i++) {
            double p = percent[i];
            if(p >= 90) grades[i] = "A+";
            else if(p >= 80) grades[i] = "A";
            else if(p >= 70) grades[i] = "B+";
            else if(p >= 60) grades[i] = "B";
            else if(p >= 50) grades[i] = "C";
            else grades[i] = "F";
        }
        return grades;
    }
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\t%\tGrade");
        for(int i = 0; i < scores.length; i++) {
            System.out.print((i+1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.printf("%.0f\t%.2f\t%.2f\t%s\n", stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] stats = calculateStats(scores);
        double[] percent = new double[n];
        for(int i = 0; i < n; i++) percent[i] = stats[i][2];
        String[] grades = calculateGrade(percent);
        displayScorecard(scores, stats, grades);
        sc.close();
    }
}
