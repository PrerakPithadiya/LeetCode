public class _48 {
    public void rotate(int[][] mat) {
        int r = mat.length, c = mat[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int row = 0; row < r; row++) {
            int i = 0, j = c - 1;
            while (i < j) {
                int temp = mat[row][i];
                mat[row][i] = mat[row][j];
                mat[row][j] = temp;
                i++;
                j--;
            }
        }
    }
}
