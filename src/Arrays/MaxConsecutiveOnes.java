package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums1 = {1, 0, 1, 1, 0, 1};
        int[] nums2 = {1, 1, 0, 1, 1, 1};
        int[] nums3 = {1, 0, 1, 0, 1, 0};
        int[] nums4 = {1, 0, 1, 1, 0, 1};
        int[] nums5 = {0, 0, 0, 0, 0, 0};
        int[] nums6 = {0, 0, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums1));
        System.out.println(findMaxConsecutiveOnes(nums2));
        System.out.println(findMaxConsecutiveOnes(nums3));
        System.out.println(findMaxConsecutiveOnes(nums4));
        System.out.println(findMaxConsecutiveOnes(nums5));
        System.out.println(findMaxConsecutiveOnes(nums6));
    }

    /**
     * This function is not readable but, from an optimization perspective it is better than using array list to add
     * the counters and getting the max counter.
     * @param nums
     * @return
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int tempCounter = 0;
        boolean gotZero = false;

        for (int num : nums) {
            if (num == 1) {
                if (!gotZero)
                    counter++;

                tempCounter++;
            } else {
                if (tempCounter > counter)
                    counter = tempCounter;

                tempCounter = 0;
                gotZero = true;
            }
        }

        return Math.max(tempCounter, counter);
    }

}
