public class _2399{
    public static void main(String[] args){
        String str = "zz";
        int arr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        System.out.println(checkDistances(str, arr));
    }
    public static boolean checkDistances(String str, int[] arr){
        int k = 0;
        for(char ch = 'a'; ch <= 'z'; ch++){
            int first = isContains(str, ch);
            if(first == -1){
                continue;
            }
            int last = secondOccurrence(str, ch);
            if(!(arr[ch - 97] == last - first - 1)){
                return false;
            }
        }
        return true;
    }
    public static int isContains(String str, char ch){
        int n = str.length();
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == ch){
                return i;
            }
        }
        return -1;
    }
    public static int secondOccurrence(String str, char ch){
        int n = str.length();
        for(int i = n - 1; i >= 0; i--){
            if(str.charAt(i) == ch){
                return i;
            }
        }
        return -1;
    }
}