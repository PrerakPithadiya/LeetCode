public class _1534{
    public static void main(String[] args){
        int arr[] = {1,1,2,2,3};
        int a = 0, b = 0, c = 1;
        System.out.println(countGoodTriplets(arr, a, b, c));
    }
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length, count = 0;
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    int ans1 = Math.abs(arr[i] - arr[j]);
                    if(ans1 <= a){
                        int ans2 = Math.abs(arr[j] - arr[k]);
                        if(ans2 <= b){  
                            int ans3 = Math.abs(arr[i] - arr[k]); 
                            if(ans3 <= c){
                                count++;
                            }
                        } else{
                            continue;
                        }
                    } else{
                        break;
                    }
                }
            }
        }
        return count;
    }
}