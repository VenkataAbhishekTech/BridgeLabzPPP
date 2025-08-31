package ExtraBuiltInFunction.list1;
import java.util.*;
public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        int terms = getInput();
        generateFibonacci(terms);
    }
    public static int getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        return n;
    }
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}    