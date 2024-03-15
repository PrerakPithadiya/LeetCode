package Arrays;

public class _2485 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(pivotInteger(n));
    }

    public static int pivotInteger(int n) {
        for (int x = 1; x <= n; x++) {
            int part1 = (x * (x + 1)) / 2;
            int part2 = (n * (n + 1)) / 2 - part1 + x;
            if (part1 == part2) {
                return x;
            }
        }
        return -1;
    }
}
