public class ToLowerCase {
    public static void main(String[] args) {
        String string = "IslaM";
        System.out.println(toLowerCaseV2(string));

    }

    static String toLowerCase(String string) {
        char[] stringArray = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < stringArray.length; i++) {
            int ch = stringArray[i];
            if (ch >= 65 && ch <= 90)
                stringArray[i] = (char) (ch + 32);
            stringBuilder.append(stringArray[i]);
        }
        return stringBuilder.toString();
    }

    static String toLowerCaseV2(String string) {
        for (int i = 0; i < string.length(); i++)
            if (string.charAt(i) >= 65 && string.charAt(i) <= 90)
                string = zabat(string, i);
        return string;
    }

    static String zabat(String string, int indexOfUpper) {
        if (indexOfUpper == 0)
            return (char) ((string.charAt(indexOfUpper)) + 32) + string.substring(1);

        if (indexOfUpper == string.length() - 1)
            return string.substring(0, string.length() - 1) + (char) ((string.charAt(indexOfUpper)) + 32);

        return string.substring(0, indexOfUpper)
                + ((char) ((string.charAt(indexOfUpper)) + 32))
                + string.substring(indexOfUpper + 1);

    }


}
