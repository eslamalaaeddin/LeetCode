package Arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0, j = m ; i < nums2.length; i++, j++) {
            nums1[j] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
