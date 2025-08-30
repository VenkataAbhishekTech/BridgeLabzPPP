package Methods.Level3;

import java.util.Scanner;

public class FactorsUtility {
    public static int[] findFactors(int num) {
        int[] temp = new int[num];
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                temp[count++] = i;
            }
        }
        int[] factors = new int[count];
        System.arraycopy(temp, 0, factors, 0, count);
        return factors;
    }
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }
    public static int findProductOfCubes(int[] factors) {
        int product = 1;
        for (int f : factors) {
            product *= (f * f * f);
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors of " + num + ": ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + findProductOfCubes(factors));
        sc.close();
    }
}
