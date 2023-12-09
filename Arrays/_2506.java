public class _2506{
    public static void main(String[] args){
        String arr[] = {"nba","cba","dba"};
        System.out.println(similarPairs(arr));
    }
    public static int similarPairs(String[] arr){
        int n = arr.length, count = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(isSimilar(arr[i], arr[j])){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isSimilar(String str1, String str2){
        int n = str1.length(), m = str2.length();
        for(int i = 0; i < n; i++){
            char ch = str1.charAt(i);
            if(!str2.contains(ch + "")){
                return false;
            }
        }
        for(int i = 0; i < m; i++){
            char ch = str2.charAt(i);
            if(!str1.contains(ch + "")){
                return false;
            }
        }
        return true;
    }
}