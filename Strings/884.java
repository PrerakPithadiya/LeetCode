class Solution {
    public String[] uncommonFromSentences(String str1, String str2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        calcWordsFrequency(str1, map1);
        calcWordsFrequency(str2, map2);
        countWords(map1, map2, list);
        countWords(map2, map1, list);
        return list.toArray(new String[0]);
    }

    public static void countWords(Map<String, Integer> map1, Map<String, Integer> map2, List<String> list) {
        for (Map.Entry<String, Integer> e : map1.entrySet()) {
            if (e.getValue() == 1 && !map2.containsKey(e.getKey())) {
                list.add(e.getKey());
            }
        }
    }

    public static void calcWordsFrequency(String str, Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        String s;
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                s = String.valueOf(sb);
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
                sb.delete(0, sb.length());
            } else {
                sb.append(ch);
            }
        }
        s = String.valueOf(sb);
        if (map.containsKey(s)) {
            map.put(s, map.get(s) + 1);
        } else {
            map.put(s, 1);
        }
    }
}
