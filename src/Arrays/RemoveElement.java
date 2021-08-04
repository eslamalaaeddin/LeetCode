package Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array1 = {3, 2, 2, 3};
        int val1 = 3;

        //Output: 2, nums = [2,2,_,_]

        int[] array2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;

        //Output: 5, nums = [0,1,4,0,3,_,_,_]

        int[] array3 = {7, 25, 21, 2, 20, 7, 24, 9, 24, 24, 6, 22, 5, 1, 26, 17, 18, 29, 25, 9, 8, 27, 6, 26, 8, 5, 27, 5, 0, 29, 26, 29, 24, 18, 23, 14, 25, 17, 15, 20, 11, 22, 4, 17, 15, 0, 26, 3, 21, 21, 12, 0, 10, 10, 26, 19, 15, 23, 16, 7, 14, 12, 7, 8, 0, 0, 14, 26, 18, 22, 8, 21, 6, 12, 0, 21, 4, 26, 16, 26, 18, 21};
        int val3 = 26;

        System.out.println(removeElement(array1, val1));
        System.out.println(removeElement(array2, val2));
        System.out.println(removeElement(array3, val3));

    }

    public static int removeElement(int[] nums, int val) {
        /*
            int[] array1 = {3, 2, 2, 3}; --> 2 2 _ _
            int val1 = 3;
         */
        //final sub array size after removing all occurrences of val
        int j = 0;
        for (int num : nums) {
            if (num != val) {
                nums[j] = num;
                j++;
            }
        }
        return j;
    }
}
