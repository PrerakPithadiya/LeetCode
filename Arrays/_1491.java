package Arrays;

public class _1491 {
    public static void main(String[] args) {
        int[] arr = {1000, 2000, 3000};
        System.out.println(average(arr));
    }

    public static double average(int[] arr) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int element : arr) {
            if (max < element) {
                max = element;
            }
            if (min > element) {
                min = element;
            }
        }
        double sum = 0, n = arr.length;
        for (int element : arr) {
            if (max != element && min != element) {
                sum += element;
            }
        }
        return sum / (n - 2);
    }
}