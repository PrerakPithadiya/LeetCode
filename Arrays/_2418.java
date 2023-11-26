import java.util.Arrays;
import java.util.HashMap;
public class _2418{
    public static void main(String[] args){
        String arr[] = {"Alice","Bob","Bob"};
        int brr[] = {155,185,150};
        System.out.println(Arrays.toString(sortPeople(arr, brr)));
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        for(int i = 0; i < n; i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for(int i = 0; i < n; i++){
            names[i] = map.get(heights[n - 1 - i]);
        }
        return names;
    }
}