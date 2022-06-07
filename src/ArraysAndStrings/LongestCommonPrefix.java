package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings1 = {"flower", "flow", "flight"};
        String[] strings2 = {"dog","racecar","car"};
        String[] strings3 = {""};
        String[] strings4 = {"a"};
        System.out.println(longestCommonPrefix(strings1));
        System.out.println(longestCommonPrefix(strings2));
        System.out.println(longestCommonPrefix(strings3));
        System.out.println(longestCommonPrefix(strings4));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];

        List<String> commonPrefixes = new ArrayList<>();
        for (int i = 0; i < strs.length - 1; i++) {
            if (strs[i] != null && strs[i+1] != null)
                commonPrefixes.add(commonPrefix(strs[i], strs[i + 1]));
        }

        String[] arr = new String[commonPrefixes.size()];

        for (int i = 0; i < arr.length; i++)
            arr[i] = commonPrefixes.get(i);

        if (arr.length == 0)
            return "";
        if (arr.length == 1)
            return arr[0];
        else
            return longestCommonPrefix(arr);
    }

    public static String commonPrefix(String string1, String string2) {
        StringBuilder result = new StringBuilder();
        char[] string1AsArray = string1.toCharArray();
        char[] string2AsArray = string2.toCharArray();
        int length = Math.min(string1AsArray.length, string2AsArray.length);

        for (int i = 0; i < length; i++) {
            if (string1AsArray[i] == string2AsArray[i])
                result.append(string1AsArray[i]);
            else
                break;
        }

        return result.toString();
    }
}
