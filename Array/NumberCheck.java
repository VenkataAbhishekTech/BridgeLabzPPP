package Array;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.print("Enter Five numbers: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = src.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println(arr[i] + " is positive and even.");
                }else{
                    System.out.println(arr[i] + " is positive and odd.");
                }
            }else if(arr[i]<0){
                System.out.println(arr[i] + " is negative.");
            }else{
                System.out.println(arr[i] + " is zero.");
            }
        }
        if(arr[0]==arr[arr.length - 1]){
            System.out.println("First and last numbers are equal.");
        }else if(arr[0] > arr[arr.length -1]){
            System.out.println("First element is greatest than last element.");
        }else{
            System.out.println("First element is less than last element.");
        }
        src.close();
    }
}
