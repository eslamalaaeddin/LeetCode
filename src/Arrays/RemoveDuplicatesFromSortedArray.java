package Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] array1 = {1,1,2};// 1 2
        //Output: 2, nums = [1,2,_]

        int[] array2 = {0, 0, -1,0,0,1,1,1,2,2,3,3,4};
        int[] array3 = {0, 0, 0, 0};
        int[] array4 = {};
        //Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

        System.out.println(removeDuplicates(array1));
        System.out.println(removeDuplicates(array2));
        System.out.println(removeDuplicates(array3));
        System.out.println(removeDuplicates(array4));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 1;//number of unique elements
        int temp = nums[0];//temp unique element?
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != temp) {
                nums[j] = nums[i];//i don't know why commenting this fails the solution
                temp = nums[j];
                j++;
            }
        }
        return j;
    }
}
