import java.util.LinkedHashMap;
import java.util.Map;
public class _2053{
    public static void main(String[] args){
        String arr[] = {"a","b","a"};
        int num = 3;
        System.out.println(kthDistinct(arr, num));
    }
    public static String kthDistinct(String[] arr, int k){
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(String str : arr){
            if(map.containsKey(str)){
                map.put(str, map.get(str) + 1);
            } else{
                map.put(str, 1);
            }
        }
        int count = 0;
        for(Map.Entry<String, Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                count++;
            } if(count == k){
                return e.getKey();
            }
        }
        return "";
    }
}