package Arrays;

public class _2748 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 21, 12};
        System.out.println(countBeautifulPairs(arr));
    }

    public static int countBeautifulPairs(int[] arr) {
        int n = arr.length, count = 0;
        for (int i = 0; i < n - 1; i++) {
            int x = arr[i];
            if (9 < x && x < 100) {
                x = x / 10;
            } else if (99 < x && x < 1000) {
                x = x / 100;
            } else if (999 < x && x < 10000) {
                x = x / 1000;
            }
            for (int j = i + 1; j < n; j++) {
                int y = arr[j] % 10;
                if (gcd(x, y) == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a != 0) {
            return a;
        } else {
            return b;
        }
    }
}
