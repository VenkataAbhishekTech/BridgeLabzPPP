package Methods.Level3;

import java.util.Random;
import java.util.Scanner;

public class  MatrixManipilating{
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] transpose(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] T = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                T[j][i] = A[i][j];
            }
        }
        return T;
    }

    public static int determinant2x2(int[][] A) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }

    public static int determinant3x3(int[][] A) {
        return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
             - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
             + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
    }

    public static double[][] inverse2x2(int[][] A) {
        int det = determinant2x2(A);
        double[][] inv = new double[2][2];
        inv[0][0] = A[1][1] / (double)det;
        inv[0][1] = -A[0][1] / (double)det;
        inv[1][0] = -A[1][0] / (double)det;
        inv[1][1] = A[0][0] / (double)det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] A) {
        int det = determinant3x3(A);
        double[][] inv = new double[3][3];
        inv[0][0] = (A[1][1] * A[2][2] - A[1][2] * A[2][1]) / (double)det;
        inv[0][1] = (A[0][2] * A[2][1] - A[0][1] * A[2][2]) / (double)det;
        inv[0][2] = (A[0][1] * A[1][2] - A[0][2] * A[1][1]) / (double)det;
        inv[1][0] = (A[1][2] * A[2][0] - A[1][0] * A[2][2]) / (double)det;
        inv[1][1] = (A[0][0] * A[2][2] - A[0][2] * A[2][0]) / (double)det;
        inv[1][2] = (A[0][2] * A[1][0] - A[0][0] * A[1][2]) / (double)det;
        inv[2][0] = (A[1][0] * A[2][1] - A[1][1] * A[2][0]) / (double)det;
        inv[2][1] = (A[0][1] * A[2][0] - A[0][0] * A[2][1]) / (double)det;
        inv[2][2] = (A[0][0] * A[1][1] - A[0][1] * A[1][0]) / (double)det;
        return inv;
    }

    public static void printMatrix(int[][] A) {
        for (int[] row : A) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printMatrix(double[][] A) {
        for (double[] row : A) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix (2 or 3): ");
        int n = sc.nextInt();
        int[][] A = createRandomMatrix(n, n);

        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("Transpose:");
        printMatrix(transpose(A));

        if (n == 2) {
            int det = determinant2x2(A);
            System.out.println("Determinant: " + det);
            if (det != 0) {
                System.out.println("Inverse:");
                printMatrix(inverse2x2(A));
            } else {
                System.out.println("Inverse does not exist (det = 0)");
            }
        } else if (n == 3) {
            int det = determinant3x3(A);
            System.out.println("Determinant: " + det);
            if (det != 0) {
                System.out.println("Inverse:");
                printMatrix(inverse3x3(A));
            } else {
                System.out.println("Inverse does not exist (det = 0)");
            }
        }
        sc.close();
    }
}
