package LinkedLists;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        String s2 = "Hello World";
        String s3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord(s2));
        System.out.println(lengthOfLastWord(s3));
    }

    public static int lengthOfLastWord(String s) {
        int length = 0;
        boolean characterFound = false;
        char[] sArray = s.toCharArray();
        for (int i = sArray.length - 1; i >= 0; i--) {
            if (sArray[i] == ' '){
                if (characterFound)
                    break;
            }
            else {
                length += 1;
                characterFound = true;
            }
        }
        return length;
    }
}


