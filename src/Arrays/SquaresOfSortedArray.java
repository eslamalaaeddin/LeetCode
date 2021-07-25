package Arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {-4, -1, 0, 3, 10};
        for (int i : sortedSquares(nums1)) {
            System.out.println(i);
        }
    }

    static int[] sortedSquares(int[] numbers){
        int[] squaredArray = new int[numbers.length];
        for (int i = 0; i < squaredArray.length; i++) {
            squaredArray[i] = (int) Math.pow(numbers[i], 2);
        }
        Arrays.sort(squaredArray);
        return squaredArray;
    }
}
