import java.util.HashMap;
import java.util.Map;
public class _2085{
    public static void main(String[] args){
        String arr[] = {"a","ab"};
        String brr[] = {"a","a","a","ab"};
        System.out.println(countWords(arr, brr));
    }
    public static int countWords(String[] arr1, String[] arr2){
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        countOccurrences(arr1, map1);
        countOccurrences(arr2, map2);
        int count = 0;
        for(Map.Entry<String, Integer> e : map1.entrySet()){
            if(e.getValue() == 1 && map2.containsKey(e.getKey()) && map2.get(e.getKey()) == 1){
                count++;
            }
        }
        return count;
    }
    public static void countOccurrences(String arr[], HashMap<String, Integer> map){
        for(String str : arr){
            if(map.containsKey(str)){
                map.put(str, map.get(str) + 1);
            } else{
                map.put(str, 1);
            }
        }
    }
}