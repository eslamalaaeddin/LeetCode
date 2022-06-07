package ArraysAndStrings;

public class ReverseString {
    public static void main(String[] args) {

    }

    //Reversing a string using two pointer tech.
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            //Swapping
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            //Moving the pointers
            i++;
            j--;
        }
    }

}
