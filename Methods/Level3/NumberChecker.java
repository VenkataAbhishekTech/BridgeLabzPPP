package Methods.Level3;

import java.util.Arrays;

public class NumberChecker {
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
    public static boolean isDuckNumber(int num) {
        String s = String.valueOf(num);
        return s.contains("0") && s.charAt(0) != '0';
    }
    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }

    public static int[] findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }

        return new int[]{smallest, secondSmallest};
    }
    public static void main(String[] args) {
        int number = 153;  

        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Digit Count: " + digitCount);

        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Is Duck Number? " + isDuckNumber(number));

        System.out.println("Is Armstrong Number? " + isArmstrong(number));

        int[] largestTwo = findLargestTwo(digits);
        System.out.println("Largest: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);

        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Smallest: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);
    }
}
