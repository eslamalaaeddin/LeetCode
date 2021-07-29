package Arrays;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 1};//Total Decrease
        int[] arr2 = {3, 5, 5};//Equal
        int[] arr3 = {0, 3, 2, 1};//#######
        int[] arr4 = {0, 0, 0, 0};//Equal
        int[] arr5 = {0, 1, 2, 3};//Total Increase
        int[] arr6 = {3, 2, 1, 0};//Total Decrease
        int[] arr7 = {0, 3, 2, 4};//#######
        int[] arr8 = {0, 1, 2, 3, 8, 7, 6, 5, 4};//#######
        int[] arr9 = {1,1,1,1,1,1,1,2, 1};//#######

        System.out.println(validMountainArray(arr1));
        System.out.println(validMountainArray(arr2));
        System.out.println(validMountainArray(arr3));
        System.out.println(validMountainArray(arr4));
        System.out.println(validMountainArray(arr5));
        System.out.println(validMountainArray(arr6));
        System.out.println(validMountainArray(arr7));
        System.out.println(validMountainArray(arr8));
        System.out.println(validMountainArray(arr9));
    }


    public static boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) return false;
        int index = getIndexOfDecreasingOrNegative(arr);
        if (index == -1) return false;
        return isTotallyIncrease(arr, index) && isTotallyDecrease(arr, index);
    }


    static int getIndexOfDecreasingOrNegative(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] < array[i] && array[i] > array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    static boolean isTotallyIncrease(int[] array, int index) {
        for (int i = 0; i < index; i++) {
            if (array[i + 1] <= array[i])
                return false;
        }
        return true;
    }


    static boolean isTotallyDecrease(int[] array, int index) {
        for (int i = index + 1; i < array.length - 1; i++) {
            if (array[i + 1] >= array[i])
                return false;
        }
        return true;
    }
}
