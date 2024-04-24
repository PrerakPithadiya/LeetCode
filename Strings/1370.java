class Solution {
    public String sortString(String str) {
        Set<Character> ts = new TreeSet<>();
        StringBuilder sb = new StringBuilder(str);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            ts.add(sb.charAt(i));
        }
        List<Character> list = new ArrayList<>(ts);
        int count = 1;
        while (!sb.isEmpty()) {
            if (count % 2 != 0) {
                for (char character : list) {
                    int ind = sb.indexOf(character + "");
                    if (ind != -1) {
                        ans.append(sb.charAt(ind));
                        sb.deleteCharAt(ind);
                    }
                }
            } else {
                for (int i = list.size() - 1; i >= 0; i--) {
                    int ind = sb.indexOf(list.get(i) + "");
                    if (ind != -1) {
                        ans.append(sb.charAt(ind));
                        sb.deleteCharAt(ind);
                    }
                }
            }
            count++;
        }
        return ans.toString();
    }
}
