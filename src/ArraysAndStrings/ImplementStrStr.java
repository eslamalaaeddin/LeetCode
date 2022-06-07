package ArraysAndStrings;

public class ImplementStrStr {
    public static void main(String[] args) {
        String haystack1 = "hello", needle1 = "ll";
        System.out.println(strStr(haystack1, needle1));

        String haystack2 = "aaaaa", needle2 = "bba";
        System.out.println(strStr(haystack2, needle2));

        String haystack3 = "", needle3 = "";
        System.out.println(strStr(haystack3, needle3));

    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        return haystack.indexOf(needle);
    }
}
