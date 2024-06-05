class Solution {
    public String addStrings(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = s1.length() - 1, j = s2.length() - 1, n1, n2, sum = 0, carry = 0;

        while (i >= 0 && j >= 0) {
            n1 = s1.charAt(i) - 48;
            n2 = s2.charAt(j) - 48;
            sum = n1 + n2 + carry;

            carry = sum / 10;
            sb.append(sum % 10);

            i--;
            j--;
        }

        while (i >= 0) {
            n1 = s1.charAt(i) - 48;
            sum = n1 + carry;
                
            carry = sum / 10;
            sb.append(sum % 10);

            i--;
        }

        while (j >= 0) {
            n2 = s2.charAt(j) - 48;
            sum = n2 + carry;

            carry = sum / 10;
            sb.append(sum % 10);

            j--;
        }

        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
