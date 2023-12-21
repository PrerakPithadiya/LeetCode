package Arrays;

public class _1995 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 5};
        System.out.println(countQuadruplets(arr));
    }

    public static int countQuadruplets(int[] arr) {
        int n = arr.length, count = 0;
        for (int a = 0; a <= n - 4; a++) {
            for (int b = a + 1; b <= n - 3; b++) {
                for (int c = b + 1; c <= n - 2; c++) {
                    for (int d = c + 1; d <= n - 1; d++) {
                        if (arr[a] + arr[b] + arr[c] == arr[d]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}