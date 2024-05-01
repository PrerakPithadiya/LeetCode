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
        return switch (str) {
            case "Jan" -> "01";
            case "Feb" -> "02";
            case "Mar" -> "03";
            case "Apr" -> "04";
            case "May" -> "05";
            case "Jun" -> "06";
            case "Jul" -> "07";
            case "Aug" -> "08";
            case "Sep" -> "09";
            case "Oct" -> "10";
            case "Nov" -> "11";
            case "Dec" -> "12";
            default -> null;
        };
    }
}
