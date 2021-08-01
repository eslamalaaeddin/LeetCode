package Arrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
                    // 1  0  0  3  12
                    // 1  3  0  0  12
                    // 1  3  12  0  0
        int[] nums2 = {0};
        int[] nums3 = {1};
        int[] nums4 = {0, 1};
        int[] nums5 = {2, 1};
        int[] nums6 = {0, 1, 0};
        int[] nums7 = {0, 0, 1};
        int[] nums8 = {1, 0, 0};
        int[] nums9 = {0, 0, 0, 1};
        int[] nums10 = {0, 0, 0, 0, 1};
        int[] nums11 = {0, 0, 0, 0, 0, 1};

        moveZeros(nums1);
        moveZeros(nums2);
        moveZeros(nums3);
        moveZeros(nums4);
        moveZeros(nums5);
        moveZeros(nums6);
        moveZeros(nums7);
        moveZeros(nums8);
        moveZeros(nums9);
        moveZeros(nums10);
        moveZeros(nums11);
    }

    //iterate over array, if even found, swap it with nums[j]
    public static void moveZeros(int[] nums){
        //j means the next index to put non zero number in it,
        //and it should be incremented after each swapping
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}

