public class _1295{
    public static void main(String[] args){
        int arr[] = {555,901,482,1771};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] arr){
        int count = 0;
        for(int n : arr){
            int digits = (int)(Math.log10(n) + 1);
            if(!((digits & 1) == 1)){
                count++;
            }
        }
        return count;
    }
}