public class IsPalindrome {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println(isPalindromeV3(s1));
        System.out.println(isPalindromeV3(s2));
        System.out.println(isPalindromeV3(s3));
    }

    static boolean isPalindrome(String s) {
        StringBuilder originalStringBuilder = new StringBuilder();
        StringBuilder palindromeStringBuilder = new StringBuilder();

        char[] sArray = s.toCharArray();

        for (char c : sArray)
            if ((Character.isLetterOrDigit(c)))
                originalStringBuilder.append(Character.toLowerCase(c));

        String originalString = originalStringBuilder.toString();

        char[] originalStringArray = originalString.toCharArray();

        for (int i = originalStringArray.length - 1; i >= 0; i--)
            palindromeStringBuilder.append(originalStringArray[i]);

        String palindromeString = palindromeStringBuilder.toString();

        System.out.println(originalString);
        System.out.println(palindromeString);

        return originalString.equals(palindromeString);
    }

    static boolean isPalindromeV2(String s) {
        if (s.isEmpty()) return true;

        StringBuilder originalStringBuilder = new StringBuilder();

        char[] sArray = s.toCharArray();

        for (char c : sArray)
            if ((Character.isLetterOrDigit(c)))
                originalStringBuilder.append(Character.toLowerCase(c));

        String originalString = originalStringBuilder.toString();

        System.out.println(originalString);

        return isPalindromeSimple(originalString);
    }

    static boolean isPalindromeV3(String s) {
        if (s.isEmpty()) return true;

        char[] sArray = s.toCharArray();
        int newStringLength = 0;
        for (int i = 0, j = 0; i < sArray.length; i++) {
            if ((Character.isLetterOrDigit(sArray[i]))) {
                sArray[j] = Character.toLowerCase(sArray[i]);
                newStringLength++;
                j++;
            }
        }
        return isPalindromeVerySimple(sArray, newStringLength);
    }

    private static boolean isPalindromeVerySimple(char[] stringArray, int length) {
        int i = 0;
        int j = length - 1;

        while (i <= j) {
            if (stringArray[i] != stringArray[j])
                return false;
            i++;
            j--;
        }
        return true;
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
