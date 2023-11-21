public class _2114{
    public static void main(String[] args){
        String arr[] = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(arr));
    }
    public static int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(String str : sentences){
            int words = countWords(str);
            max = (max < words) ? words : max;
        }
        return max;
    }
    public static int countWords(String str){
        int words = 1, n = str.length();
        for(int i = 0; i < n - 1; i++){
            if(str.charAt(i) == ' ' && str.charAt(i + 1) != ' '){
                words++;
            }
        }
        return words;
    }
}