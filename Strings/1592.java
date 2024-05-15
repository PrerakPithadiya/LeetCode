class Solution {
    public String reorderSpaces(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder();


        // count spaces
        int spaces = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                spaces++;
            }
        }


        // count words
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (!sb.isEmpty()) {
                    list.add(sb.toString());
                    sb.delete(0, sb.length());
                }
            } else {
                sb.append(ch);
            }
        }
        if (!sb.isEmpty()) {
            list.add(sb.toString());
            sb.delete(0, sb.length());
        }
        int words = list.size();


        if (spaces == 0 && words == 1) {
            return str;
        }


        // calculating between spaces
        StringBuilder spaceBet = new StringBuilder();
        int sBetween = 0;
        if (words != 1) {
            sBetween = spaces / (words - 1);
        }
        spaceBet.append(" ".repeat(Math.max(0, sBetween)));


        // calculating end spaces
        StringBuilder spaceEnd = new StringBuilder();
        int sEnd = spaces;
        if (words != 1) {
            sEnd = spaces % (words - 1);
        }
        spaceEnd.append(" ".repeat(Math.max(0, sEnd)));


        // calculating result (final string)
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words - 1; i++) {
            result.append(list.get(i)).append(spaceBet);
        }
        result.append(list.get(words - 1)).append(spaceEnd);

        return result.toString();
    }
}
