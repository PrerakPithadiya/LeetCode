public class _1684{
    public static void main(String[] args){
        String arr[] = {"cc","acd","b","ba","bac","bad","ac","d"};
        String str = "cad";
        System.out.println(countConsistentStrings(str, arr));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(String str : words){
            if(isConsistent(str, allowed)){
                count++;
            }
        }
        return count;
    }
    public static boolean isConsistent(String str, String s){
        int n = str.length();
        for(int i = 0; i < n; i++){
            if(!s.contains(str.charAt(i) + "")){
                return false;
            }
        }
        return true;
    }
}