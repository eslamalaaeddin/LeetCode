import java.util.LinkedHashMap;
import java.util.Map;

public class IsIsomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("badc", "baba"));
        System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        char[] sDistinct = makeDistinct(s);
        char[] tDistinct = makeDistinct(t);

        if (sDistinct.length != tDistinct.length)
            return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Map<Character, Character> map = new LinkedHashMap<>();

        for (int i = 0 ; i < sDistinct.length ; i++){
            map.put(sDistinct[i], tDistinct[i]);
        }

        for (int i = 0 ; i < sArray.length ; i++){
            if(map.get(sArray[i]) != tArray[i])
                return false;
        }

        return true;

    }

    private static char[] makeDistinct(String s){
        char[] sArray = s.toCharArray();
        StringBuilder sBuilder = new StringBuilder();

        for(char ch : sArray){
            if(!sBuilder.toString().contains(String.valueOf(ch)))
                sBuilder.append(ch);
        }

        return sBuilder.toString().toCharArray();
    }

}
