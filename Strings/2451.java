class Solution {
    public String oddString(String[] words) {
        int n = words[0].length();
        String strArr = "";
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        for (String s : words) {

            int[] arr = new int[n - 1];

            for (int i = 0; i < n - 1; i++) {
                arr[i] = s.charAt(i + 1) - s.charAt(i);
            }
             
            strArr = Arrays.toString(arr);

            if (map1.containsKey(strArr)) {
                map1.put(strArr, map1.get(strArr) + 1);
            } else {
                map1.put(strArr, 1);
            }

            map2.put(strArr, s);
        }

        for (Map.Entry<String, Integer> e : map1.entrySet()) {
            if(e.getValue() == 1) {
                strArr = e.getKey();
                break;
            }
        }

        return map2.get(strArr);
    }
}
