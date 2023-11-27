public class _1979{
    public static void main(String[] args){
        int arr[] = {3,3};
        System.out.println(findGCD(arr));
    }
    public static int findGCD(int[] arr){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int element : arr){
            if(max < element){
                max = element;
            } if(min > element){
                min = element;
            }
        }
        return GCD(max, min);
    }
    public static int GCD(int a, int b){
        while(a != 0 && b != 0){
            if(a > b){
                a = a % b;
            } else{
                b = b % a;
            }
        }
        if(a != 0){ return a; }
        else{ return b; }
    }
}