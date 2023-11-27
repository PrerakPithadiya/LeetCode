public class _2733{
    public static void main(String[] args){
        int arr[] = {2,1,3};
        System.out.println(findNonMinOrMax(arr));
    }
    public static int findNonMinOrMax(int[] arr){
        int n = arr.length;
        if(n < 3){
            return -1;
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int element : arr){
            if(max < element){
                max = element;
            } if(min > element){
                min = element;
            }
        }
        for(int element : arr){
            if(element != max && element != min){
                return element;
            }
        }
        return -1;
    }
}