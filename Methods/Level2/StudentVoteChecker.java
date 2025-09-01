package Methods.Level2;

import java.util.Scanner;

public class StudentVoteChecker {
     public boolean canStudentVote(int age) {
        if (age < 0) { 
            return false;
        }
        return age >= 18;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10]; 

        System.out.println("Enter the ages of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\nVoting Eligibility Results:");

        for (int i = 0; i < ages.length; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + " → Invalid age entered.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + ") → Eligible to vote ✅");
            } else {
                System.out.println("Student " + (i + 1) + " (Age " + ages[i] + ") → Not eligible to vote ❌");
            }
        }

        sc.close();
    }
}
