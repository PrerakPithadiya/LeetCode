import java.util.List;
import java.util.ArrayList;
public class _682{
    public static void main(String[] args){
        String arr[] = {"1","C"};
        System.out.println(calPoints(arr));
    }
    public static int calPoints(String[] operations){
        List<Integer> list = new ArrayList<>();
        int n = 0, sum = 0;
        for(String str : operations){
            n = list.size();
            if(str.equals("+")){
                if(n >= 2){
                    list.add(list.get(n - 1) + list.get(n - 2));
                }
            } else if(str.equals("D")){
                if(n >= 1){
                    list.add(list.get(n - 1) * 2);
                }
            } else if(str.equals("C")){
                if(n >= 1){
                    list.remove(n - 1);
                }
            } else{
                list.add(Integer.parseInt(str));
            }
        }
        for(int element : list){
            sum += element;
        }
        return sum;
    }
}