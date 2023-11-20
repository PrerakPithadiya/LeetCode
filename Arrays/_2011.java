public class _2011{
    public static void main(String[] args){
        String arr[] = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(arr));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String str : operations){
            if(str.equals("X++")){
                x++;
            } else if(str.equals("++X")){
                ++x;
            } else if(str.equals("X--")){
                x--;
            } else{
                --x;
            }
        }
        return x;
    }
}