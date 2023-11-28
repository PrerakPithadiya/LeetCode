public class _2678{
    public static void main(String[] args){
        String arr[] = {"1313579440F2036","2921522980M5644"};
        System.out.println(countSeniors(arr));
    }
    public static int countSeniors(String[] arr){
        int count = 0;
        for(String str : arr){
            if(60 < Integer.parseInt(str.substring(11, 13))){
                count++;
            }
        }
        return count;
    }
}