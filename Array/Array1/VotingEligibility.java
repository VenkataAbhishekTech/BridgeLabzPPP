package Array.Array1;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.print("Enter ages of 10 Students: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = src.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println("Invalid age: "+ arr[i]);
            }else if(arr[i]>=18){
                System.out.println("Student with the age "+ arr[i] + " can vote.");
            }else{
                System.out.println("Student with the age "+arr[i] + " can not vote.");
            }
        }
        src.close();
    }
}
