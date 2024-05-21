class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            while (j >= 0 && words[j].isEmpty()) {
                j--;
            }
            if (isAnagram(words[i], words[j])) {
                words[i] = "";
            }
        }
        List<String> list = new ArrayList<>();
        for (String s : words) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        return list;
    }

    public static boolean isAnagram(String s1, String s2) {
        int[] freq = new int[26];
        for (char ch : s1.toCharArray()) {
            freq[ch - 97]++;
        }

        for (char ch : s2.toCharArray()) {
            freq[ch - 97]--;
        }

        for (int element : freq) {
            if (element != 0) {
                return false;
            }
        }
        return true;
    }
}
