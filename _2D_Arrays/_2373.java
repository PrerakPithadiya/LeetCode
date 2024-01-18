import java.util.Arrays;

public class _2373 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        int[][] result = largestLocal(mat);
        printTheMatrix(result);
    }

    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length, l1 = 0, l2 = 2, r1, r2;
        int[][] maxLocal = new int[n - 2][n - 2];
        for (int i = 0; i < n - 2; i++) {
            r1 = 0;
            r2 = 2;
            for (int j = 0; j < n - 2; j++) {
                maxLocal[i][j] = maxElement(grid, l1, r1, l2, r2);
                r1++;
                r2++;
            }
            l1++;
            l2++;
        }
        return maxLocal;
    }

    public static int maxElement(int[][] mat, int l1, int r1, int l2, int r2) {
        int max = Integer.MIN_VALUE;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                max = Math.max(max, mat[i][j]);
            }
        }
        return max;
    }

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}