public class _2185{
    public static void main(String[] args){
        String arr[] = {"leetcode","win","loops","success"};
        String prefix = "code";
        System.out.println(prefixCount(arr, prefix));
    }
    public static int prefixCount(String[] words, String pref){
        int count = 0;
        for(String str : words){
            if(str.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}