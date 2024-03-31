import java.lang.StringBuilder;

public class _1880 {
  public static void main(String[] args) {
    String str1 = "aaa";
    String str2 = "a";
    String str3 = "aaaa";
    System.out.println(isSumEqual(str1, str2, str3));
  }

  public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
    StringBuilder sb1, sb2, sb3;
    sb1 = new StringBuilder();
    sb2 = new StringBuilder();
    sb3 = new StringBuilder();

    for (int i = 0; i < firstWord.length(); i++) {
      sb1.append(firstWord.charAt(i) - 97);
    }

    for (int i = 0; i < secondWord.length(); i++) {
      sb2.append(secondWord.charAt(i) - 97);
    }

    for (int i = 0; i < targetWord.length(); i++) {
      sb3.append(targetWord.charAt(i) - 97);
    }

    int num1 = Integer.parseInt(sb1.toString());
    int num2 = Integer.parseInt(sb2.toString());
    int num3 = Integer.parseInt(sb3.toString());

    return num1 + num2 == num3;
  }
}
