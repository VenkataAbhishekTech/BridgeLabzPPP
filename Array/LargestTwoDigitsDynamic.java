package Array;

import java.util.Scanner;

public class LargestTwoDigitsDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            int digit = number % 10;   
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }

            digits[index] = digit; 
            index++;
            number /= 10; 
        }

        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.print("\nDigits stored in array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit = " + largest);
        if (secondLargest != -1) {
            System.out.println("Second Largest digit = " + secondLargest);
        } else {
            System.out.println("Second Largest digit not found (all digits same).");
        }

        sc.close();
    }
}
