package Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
                    // 0  1  2  3
        int[] nums1 = {3, 1, 2, 4};
        int[] nums2 = {1,2,3,4,5,6};
        int[] nums3 = {0};
        int[] nums4 = {1,3,5,7,8};
        int[] nums5 = {2,4,6,8,7};
        int[] nums6 = {0,0,0,0,0};
        int[] nums7 = {1,1,2,1,1};
        int[] nums8 = {2,1,2,1,1};

        ArrayUtils.printArray(sortArrayByParity(nums1));
        ArrayUtils.printArray(sortArrayByParity(nums2));
        ArrayUtils.printArray(sortArrayByParity(nums3));
        ArrayUtils.printArray(sortArrayByParity(nums4));
        ArrayUtils.printArray(sortArrayByParity(nums5));
        ArrayUtils.printArray(sortArrayByParity(nums6));
        ArrayUtils.printArray(sortArrayByParity(nums7));
        ArrayUtils.printArray(sortArrayByParity(nums8));
    }

    //iterate over array, if even found, swap it with nums[j]
    public static int[] sortArrayByParity(int[] nums) {
        //j means the next index to put even number in it,
        //and it should be incremented after each swapping
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }

}
