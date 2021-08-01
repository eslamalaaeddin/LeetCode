package Arrays;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] array1 = {3, 2, 1};//1
        int[] array2 = {1, 2};//2
        int[] array3 = {2, 2, 3, 1};//1
        int[] array4 = {1};//1
        int[] array5 = {1,2,3,4,5,6,7,8,9};//7
        int[] array6 = {9,8,7,6,5,4,3,2,1};//7
        int[] array7 = {1,2,2,5,3,5};//2
        int[] array8 = {1,1,2};//2
        int[] array9 = {1,2,3};//1
        int[] array10 = {3,3,3};//1


        System.out.println(thirdMax(array1));
        System.out.println(thirdMax(array2));
        System.out.println(thirdMax(array3));
        System.out.println(thirdMax(array4));
        System.out.println(thirdMax(array5));
        System.out.println(thirdMax(array6));
        System.out.println(thirdMax(array7));
        System.out.println(thirdMax(array8));
        System.out.println(thirdMax(array9));
        System.out.println(thirdMax(array10));


    }

    //Don't know why it does not work
    public static int getThirdMax(int[] nums){
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        return thirdLargestNum(nums, largestNum(nums), secondLargestNum(nums, largestNum(nums)));
    }

    public static int largestNum(int[] nums){
        int max = 0;
        for (int num : nums) {
            if (max <= num)
                max = num;
        }
        return max;
    }

    public static int secondLargestNum(int[] nums, int largestNum){
        int max = 0;
        for (int num : nums) {
            if (max <= num && num != largestNum) max = num;
        }
        if (max == 0) return largestNum;

        return Math.min(max, largestNum);
    }

    public static int thirdLargestNum(int[] nums, int largestNum, int secondLargestNum){
        int max = 0;
        for (int num : nums) {
            if (max <= num && num != largestNum && num != secondLargestNum)
                max = num;
        }
        if (max == 0) return Math.min(largestNum, secondLargestNum);

        return Math.min(max, secondLargestNum);
    }


    //O(n log(n))
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int[] numsNoDuplicates = removeDuplicates(nums);

        if (numsNoDuplicates.length == 1) return numsNoDuplicates[0];
        if (numsNoDuplicates.length == 2) return Math.max(numsNoDuplicates[0], numsNoDuplicates[1]);

        return numsNoDuplicates[numsNoDuplicates.length - 3];
    }
    //Nums Must Be Sorted
    public static int[] removeDuplicates(int[] nums) {
        int j = 1;//number of unique elements
        int temp = nums[0];//temp unique element?
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != temp) {
                nums[j] = nums[i];//i don't know why commenting this fails the solution
                temp = nums[j];
                j++;
            }
        }
        return Arrays.copyOf(nums, j);
    }
}
