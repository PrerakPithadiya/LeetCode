import java.util.HashMap;
import java.util.Map;

public class _1394 {
    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 3, 3};
        System.out.println(findLucky(arr));
    }

    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int element : arr) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }
        int max = -1;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getKey() == e.getValue()) {
                if (max < e.getKey()) {
                    max = e.getKey();
                }
            }
        }
        return max;
    }
}
