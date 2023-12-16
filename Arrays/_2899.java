package Arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class _2899 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(Arrays.asList("1", "prev", "2", "prev", "prev"));
        System.out.println(lastVisitedIntegers(arr));
    }

    public static List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int n = words.size(), k = 0;
        for (int i = 0; i < n; i++) {
            if (words.get(i).equals("prev")) {
                k++;
                if (list.size() < k) {
                    ans.add(-1);
                } else {
                    ans.add(list.get(list.size() - 1 - (k - 1)));
                }
            } else {
                k = 0;
                list.add(Integer.parseInt(words.get(i)));
            }
        }
        return ans;
    }
}