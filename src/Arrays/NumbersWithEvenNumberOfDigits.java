package Arrays;

public class NumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums1 = {12, 345, 2, 6, 7896};
        int[] nums2 = {555, 901, 482, 1771};
        int[] nums3 = {1, 1, 1, 1};

        System.out.println(findNumbers(nums1));
        System.out.println(findNumbers(nums2));
        System.out.println(findNumbers(nums3));
    }

    //[12,345,2,6,7896] --> 2
    static int findNumbers(int[] numbers) {
        int counter = 0;
        for (int number : numbers) {
            if (isDigitsEven(number)) counter++;
        }
        return counter;
    }

    static boolean isDigitsEven(int number) {
        return String.valueOf(number).length() % 2 == 0;
    }
}
