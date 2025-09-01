package Methods.Level3;

import java.util.Arrays;

public class NumberCheckerCount {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d * d;
        }
        return sum;
    }
    public static boolean isHarshad(int num) {
        int[] digits = NumberChecker.getDigits(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int d : digits) {
            freq[d][0] = d;
            freq[d][1]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        int number = 1729; 

        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        int sumSq = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumSq);

        boolean harshad = isHarshad(number);
        System.out.println("Is Harshad Number: " + harshad);

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit frequencies: ");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " occurs " + freq[i][1] + " times");
            }
        }
    }
}
