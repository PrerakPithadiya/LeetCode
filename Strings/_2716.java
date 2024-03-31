import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args) {
    String str = "kkkkqdxre";
    System.out.println(minimizedStringLength(str));
  }

  public static int minimizedStringLength(String s) {
    StringBuilder sb = new StringBuilder(s);
    for (int i = 0; i < sb.length(); i++) {
      if (leftRemove(sb, i - 1, 0, sb.charAt(i))) {
        i--;
      }
      if (i < sb.length()) {
        rightRemove(sb, i + 1, sb.length() - 1, sb.charAt(i));
      }
    }
    return sb.length();
  }

  public static boolean leftRemove(StringBuilder sb, int start, int end, char ch) {
    for (int i = start; i >= end; i--) {
      if (sb.charAt(i) == ch) {
        sb.deleteCharAt(i);
        return true;
      }
    }
    return false;
  }

  public static void rightRemove(StringBuilder sb, int start, int end, char ch) {
    for (int i = start; i <= end; i++) {
      if (sb.charAt(i) == ch) {
        sb.deleteCharAt(i);
        return;
      }
    }
  }
}
