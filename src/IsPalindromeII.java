import java.util.ArrayList;
import java.util.List;

public class IsPalindromeII {
    public static void main(String[] args) {
        System.out.println(validPalindromeSlow("aba"));
        System.out.println(validPalindromeSlow("abca"));
        System.out.println(validPalindromeSlow("abc"));

    }


    public static boolean validPalindromeSlow(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] sArray = s.toCharArray();

        for (int i = 0; i < sArray.length; i++) {
            for (int j = 0; j < sArray.length; j++) {
                if (i != j)
                    stringBuilder.append(sArray[j]);
            }
            if (isPalindromeSimple(stringBuilder.toString()))
                return true;
            stringBuilder = new StringBuilder();
        }
        return false;
    }

    static boolean isPalindromeSimple(String string) {
        char[] stringArray = string.toCharArray();
        int i = 0;
        int j = stringArray.length - 1;

        while (i <= j) {
            if (stringArray[i] != stringArray[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}
