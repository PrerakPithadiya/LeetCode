public class _2558 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1};
        int k = 4;
        System.out.println(pickGifts(arr, k));
    }

    public static long pickGifts(int[] arr, int k) {
        for (int i = 1; i <= k; i++) {
            int ind = findMax(arr);
            int max = arr[ind];
            int ans = (int) Math.floor(Math.sqrt(max));
            if (ans < 1) {
                arr[ind] = 1;
            } else {
                arr[ind] = ans;
            }
        }
        long sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    public static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE, index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}