public class _867 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}};
        int[][] res = transpose(mat);
        for (int[] arr : res) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] a) {
        int r = a.length, c = a[0].length;
        int[][] b = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }
}
