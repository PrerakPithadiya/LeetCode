class Solution {
    public int tribonacci(int n) {
        int a = 0, b = 1, c = 1, d;
        for (int i = 1; i <= n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return a;
    }
}
