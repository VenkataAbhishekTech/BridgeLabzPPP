package Array;

import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        if(num<=0){
            System.out.println("Error: Please enter a natural number (greater than 0).");
            return;
        }
        int odd[]=new int[num/2+1];
        int even[] = new int[num/2+1];
        int oddIndex = 0,   evenIndex=0;

        for(int i=1;i<=num;i++){
            if(i%2==0){
                even[evenIndex] = i;
                evenIndex++;
            }else{
                odd[oddIndex]=i;
                oddIndex++;
            }
        }
        System.out.print("odd numbers: ");
        for(int i =0;i<oddIndex;i++){
            System.out.println(odd[i] + " ");
        }
        System.out.print("Even numbers: ");
        for(int i=0;i<evenIndex;i++){
            System.out.println(even[i] + " ");
        }
        sc.close();
    }
}
