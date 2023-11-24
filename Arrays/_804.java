import java.util.HashMap;
import java.util.HashSet;
import java.lang.StringBuilder;
public class _804{
    public static void main(String[] args){
        String arr[] = {"a"};
        System.out.println(uniqueMorseRepresentations(arr));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        HashMap<Character, String> map = new HashMap<Character, String>();
        HashSet<String> set = new HashSet<String>();
        setMorseCode(map);
        for(String str : words){
            set.add(findCode(str, map));
        }
        return set.size();
    }
    public static String findCode(String str, HashMap<Character, String> map){
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for(int i = 0; i < n; i++){
            sb.append(map.get(str.charAt(i)));
        }
        return sb.toString();
    }
    public static void setMorseCode(HashMap<Character, String> m){
        m.put('a', ".-");  m.put('h', "....");  m.put('o', "---");  m.put('u', "..-");
        m.put('b', "-...");  m.put('i', "..");  m.put('p', ".--.");  m.put('v', "...-");   
        m.put('c', "-.-.");  m.put('j', ".---");  m.put('q', "--.-");  m.put('w', ".--");
        m.put('d', "-..");  m.put('k', "-.-");  m.put('r', ".-.");  m.put('x', "-..-");
        m.put('e', ".");  m.put('l', ".-..");  m.put('s', "...");  m.put('y', "-.--");
        m.put('f', "..-.");  m.put('m', "--");  m.put('t', "-");  m.put('z', "--..");
        m.put('g', "--.");  m.put('n', "-."); 
    }
}