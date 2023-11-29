public class _2255{
    public static void main(String[] args){
        String arr[] = {"a","a"};
        String str = "aa";
        System.out.println(countPrefixes(arr, str));
    }
    public static int countPrefixes(String[] words, String s){
        int count = 0;
        for(String str : words){
            if(s.startsWith(str)){
                count++;
            }
        }
        return count;
    }
}