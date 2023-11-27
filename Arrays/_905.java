import java.util.Arrays;
public class _905{
    public static void main(String[] args){
        int arr[] = {0};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
    public static int[] sortArrayByParity(int[] arr){
        int i = 0, j = arr.length - 1;
        while(i < j){
            if(((arr[i] & 1) == 1) && (!((arr[j] & 1) == 1))){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } if(arr[i] % 2 == 0){
                i++;
            } if(arr[j] % 2 != 0){
                j--;
            }
        }
        return arr;
    }
}