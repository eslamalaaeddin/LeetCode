package Arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {-4, -1, 0, 3, 10};
                    // 0  1  9  16  100
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

    // TODO: 8/2/2021 Solve it in linear time
}
