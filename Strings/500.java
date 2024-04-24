class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for (String str : words) {
            if (isValid(str.toLowerCase())) {
                list.add(str);
            }
        }
        int n = list.size(), k = 0;
        words = new String[n];
        for (String str : list) {
            words[k++] = str;
        }
        return words;
    }

    public static boolean isValid(String str) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        boolean result = true;
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if (!row1.contains(ch + "")) {
                result = false;
                break;
            }
        }
        
        if (result) {
            return true;
        }

        result = true;

        for (char ch : arr) {
            if (!row2.contains(ch + "")) {
                result = false;
                break;
            }
        }

        if (result) {
            return true;
        }

        result = true;

        for (char ch : arr) {
            if (!row3.contains(ch + "")) {
                result = false;
                break;
            }
        }

        return result;
    }
}
