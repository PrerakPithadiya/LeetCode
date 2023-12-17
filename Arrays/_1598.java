package Arrays;

public class _1598 {
    public static void main(String[] args) {
        String arr[] = new String[]{"d1/", "../", "../", "../"};
        System.out.println(minOperations(arr));
    }

    public static int minOperations(String[] logs) {
        int count = 0;
        for (String str : logs) {
            if (str.equals("../")) {
                if (count > 0) {
                    count--;
                }
            } else if (str.equals("./")) {
                count += 0;
            } else {
                count++;
            }
        }
        if (count < 0) {
            return 0;
        }
        return count;
    }
}