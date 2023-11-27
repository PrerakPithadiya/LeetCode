import java.util.HashMap;
import java.util.Map;
public class _1748{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        System.out.println(sumOfUnique(arr));
    }
    public static int sumOfUnique(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        for(int element : arr){
            if(map.containsKey(element)){
                map.put(element, map.get(element) + 1);
            } else{
                map.put(element, 1);
            }
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                sum += e.getKey();
            }
        }
        return sum;
    }
}