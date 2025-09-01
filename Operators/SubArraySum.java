package Operators;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 8, 7, 9};
        int target = 7;

        int start = 0, sum = 0;
        boolean found = false;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target && start <= end) {
                sum -= arr[start++];
            }

            if (sum == target) {
                System.out.print("Subarray with sum " + target + ": ");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No subarray with sum " + target);
        }
    }
}
