package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// TODO: 8/3/2021 Try to make it O(n), currently it is O(nlg(n))
public class FindAllNumbersDisappearedInArray {
    //in range and not in array
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};//5 6
        int[] nums2 = {1, 1, 1};
        int[] nums3 = {};//1
        int[] nums4 = {10, 2, 5, 10, 9, 1, 1, 4, 3, 7};//


        System.out.println(findDisappearedNumbers(nums));
        System.out.println(findDisappearedNumbers(nums2));
        System.out.println(findDisappearedNumbers(nums3));
        System.out.println(findDisappearedNumbers(nums4));
    }


    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> notInArray = new ArrayList<>();
        Arrays.sort(nums);
        //For each number in range and not in array add it to list
        for (int i = 1; i <= nums.length; i++)
            if (!binarySearch(nums, i)) notInArray.add(i);
        return notInArray;
    }

    public static boolean binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return true;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return false;
    }


    //Should use binary search as it takes O(n)
    public static boolean isInArray(int num, int[] nums) {
        for (int i : nums)
            if (i == num) return true;
        return false;
    }
}
