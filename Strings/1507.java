class Solution {
    public String reformatDate(String str) {
        int n = str.length(), space1, space2;
        String date, month, year;
        if ('a' <= str.charAt(1) && str.charAt(1) <= 'z') {
            date = "" + str.charAt(0);
        } else {
            date = "" + str.charAt(0) + str.charAt(1);
        } if (str.charAt(4) == ' ') {
            space1 = 4;
        } else {
            space1 = 3;
        } if (str.charAt(8) == ' ') {
            space2 = 8;
        } else {
            space2 = 7;
        }
        month = str.substring(space1 + 1, space2);
        year = str.substring(space2 + 1, n);
        month = findMonth(month);
        if (date.length() == 1) {
            date = "0" + date;
        }
        return year + "-" + month + "-" + date;
    }

    public static String findMonth(String str) {
        switch (str) {
            case "Jan": return "01";
            case "Feb": return "02";
            case "Mar": return "03";
            case "Apr": return "04";
            case "May": return "05";
            case "Jun": return "06";
            case "Jul": return "07";
            case "Aug": return "08";
            case "Sep": return "09";
            case "Oct": return "10";
            case "Nov": return "11";
            case "Dec": return "12";
        }
        return null;
    }
}
