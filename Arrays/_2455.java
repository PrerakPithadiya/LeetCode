package Arrays;

public class _2455 {
    public static void main(String[] args) {
        int[] arr = {94, 65, 82, 40, 79, 74, 92, 84, 37, 19, 16, 85, 20, 79, 25, 89, 55, 67, 84, 3, 79, 38, 16, 44, 2, 54, 58, 94, 69, 71, 14, 24, 13, 21};
        System.out.println(averageValue(arr));
    }

    public static int averageValue(int[] arr) {
        float sum = 0.0f;
        int k = 0;
        for (int element : arr) {
            if (element % 2 == 0 && element % 3 == 0) {
                sum += element;
                k++;
            }
        }
        if (k == 0) {
            return 0;
        }
        return (int) Math.floor(sum / k);
    }
}