package Arrays;

import java.util.List;
import java.util.ArrayList;

public class _1408 {
    public static void main(String[] args) {
        String[] arr = new String[]{"blue", "green", "bu"};
        System.out.println(stringMatching(arr));
    }

    public static List<String> stringMatching(String[] arr) {
        List<String> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i].length() <= arr[j].length() && arr[j].contains(arr[i])) {
                    ans.add(arr[i]);
                    break;
                }
            }
        }
        return ans;
    }
}