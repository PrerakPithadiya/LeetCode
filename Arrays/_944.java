public class _944{
    public static void main(String[] args){
        String arr[] = {"zyx","wvu","tsr"};
        System.out.println(minDeletionSize(arr));
    }
    public static int minDeletionSize(String[] arr){
        int n = arr.length, m = arr[0].length(), count = 0;
        for(int col = 0; col < m; col++){
            for(int i = 0; i < n - 1; i++){
                if(arr[i].charAt(col) > arr[i + 1].charAt(col)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}