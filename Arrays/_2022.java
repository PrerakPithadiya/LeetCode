package Arrays;

import java.util.Arrays;

public class _2022 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int row = 1;
        int col = 1;
        int[][] mat = construct2DArray(arr, row, col).clone();
        printMatrix(mat);
    }

    public static int[][] construct2DArray(int[] arr, int m, int n) {
        int len = arr.length;
        if (m * n != len) {
            return new int[][]{};
        }
        int[][] mat = new int[m][n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = arr[k++];
            }
        }
        return mat;
    }

    public static void printMatrix(int[][] mat) {
        int n = mat.length;
        if (n == 0) {
            System.out.println("Empty Matrix!!");
            return;
        }
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}