class Solution {
    public String reverseOnlyLetters(String str) {
        char[] arr = str.toCharArray();
        int i = 0, n = arr.length, j = n - 1;
        while (i < j) {
            while (i < n && !('a' <= arr[i] && arr[i] <= 'z') && !('A' <= arr[i] && arr[i] <= 'Z')) {
                i++;
            }
            while (j > -1 && !('a' <= arr[j] && arr[j] <= 'z') && !('A' <= arr[j] && arr[j] <= 'Z')) {
                j--;
            }
            if (i >= j) {
                break;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        str = new String(arr);
        return str;   
    }
}
