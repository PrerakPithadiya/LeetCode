public class _2535{
    public static void main(String[] args){
        int arr[] = {1,2,3,4};
        System.out.println(differenceOfSum(arr));
    }
    public static int differenceOfSum(int[] arr){
        int elementSum = 0, digitSum = 0, n = arr.length;
        for(int i = 0; i < n; i++){
            elementSum = elementSum + arr[i];
            digitSum = digitSum + sum(arr[i]);
        }
        return (int)Math.abs(elementSum - digitSum);
    }
    public static int sum(int n){
        int sum = 0;
        while(n != 0){
            sum = sum + (n % 10);
            n /= 10;
        }
        return sum;
    }
}