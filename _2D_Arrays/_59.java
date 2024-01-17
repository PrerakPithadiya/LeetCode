import java.util.Arrays;

public class _59 {
    public static void main(String[] args) {
        int n = 3;
        int[][] mat = generateMatrix(n);
        printTheMatrix(mat);
    }

    public static int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1, val = 1;

        while (top <= bottom && left <= right) {
            // top
            for (int j = left; j <= right; j++) {
                mat[top][j] = val++;
            }

            //right
            for (int i = top + 1; i <= bottom; i++) {
                mat[i][right] = val++;
            }

            // bottom
            for (int j = right - 1; j >= left; j--) {
                if (top == bottom) {
                    break;
                }
                mat[bottom][j] = val++;
            }

            // left
            for (int i = bottom - 1; i >= top + 1; i--) {
                if (left == right) {
                    break;
                }
                mat[i][left] = val++;
            }

            top++;
            bottom--;
            left++;
            right--;
        }
        return mat;
    }

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}