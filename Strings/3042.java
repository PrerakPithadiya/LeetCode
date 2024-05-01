class Solution {
    public int countPrefixSuffixPairs(String[] arr) {
        int n = arr.length, count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j].startsWith(arr[i]) && arr[j].endsWith(arr[i])) {
                    count++;
                }
            }
        }
        return count;
    }
}
