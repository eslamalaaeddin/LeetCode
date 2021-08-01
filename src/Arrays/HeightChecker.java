package Arrays;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 4, 2, 1, 3};//3
        int[] array2 = {5, 1, 2, 3, 4};//5
        int[] array3 = {1, 2, 3, 4, 5};//0
        int[] array4 = {};//0

        System.out.println(heightChecker(array1));
        System.out.println(heightChecker(array2));
        System.out.println(heightChecker(array3));
        System.out.println(heightChecker(array4));
    }

    public static int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int counter = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i])
                counter++;
        }
        return counter;
    }
}
