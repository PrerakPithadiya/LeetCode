public class _2586{
    public static void main(String[] args){
        String arr[] = {"hey","aeo","mu","ooo","artro"};
        int start = 1;
        int end = 4;
        System.out.println(vowelStrings(arr, start, end));
    }
    public static int vowelStrings(String[] arr, int left, int right){
        int count = 0;
        for(int i = left; i <= right; i++){
            int n = arr[i].length();
            boolean con1 = isVowel(arr[i].charAt(0));
            boolean con2 = isVowel(arr[i].charAt(n - 1));
            if(con1 && con2){
                count++;
            }
        }
        return count;
    }
    public static boolean isVowel(char c){
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u');
    }
}