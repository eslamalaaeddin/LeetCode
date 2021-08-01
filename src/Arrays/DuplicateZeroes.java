package Arrays;

public class DuplicateZeroes {
    public static void main(String[] args) {
        int[] numbers1 = {1, 0, 2, 3, 0, 4, 5, 0};//1 0 0 2 3 0 0 4
        int[] numbers2 = {1, 0, 1, 0, 1};//1 0 0 1 0
        int[] numbers3 = {0, 4, 0, 8, 0, 1};//0 0 4 0 0 8
        int[] numbers4 = {0, 0, 4, 8, 0, 1};//0 0 0 0 4 8

        duplicateZeros(numbers1);
        duplicateZeros(numbers2);
        duplicateZeros(numbers3);
        duplicateZeros(numbers4);

    }
    static void duplicateZeros(int[] numbers) {
        StringBuilder builder = new StringBuilder();
        for (int number : numbers) {
            if (number == 0)
                builder.append("00");
            else
                builder.append(number);
        }

        String s = builder.toString().substring(0, numbers.length);
        System.out.println(s);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(s.substring(i, i + 1));
        }

    }


}
