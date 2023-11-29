import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
public class _1207{
    public static void main(String[] args){
        int arr[] = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int element : arr){
            if(map.containsKey(element)){
                map.put(element, map.get(element) + 1);
            } else{
                map.put(element, 1);
            }
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            set.add(e.getValue());
        }
        return map.size() == set.size();
    }
}