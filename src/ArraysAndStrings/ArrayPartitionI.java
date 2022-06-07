package ArraysAndStrings;

import Arrays.ArrayUtils;

class ArrayPartitionI {


    public static void main(String[] args) {
        int[] array1 = {3, 1, 2};
        int[] array2 = {5, 4, 6};

        merge(array1, array2);
    }

    private static void print2DArray(int[][] twoDArray) {
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray.length; j++) {
                if (j == twoDArray[0].length - 1)
                    System.out.println(twoDArray[i][j]);
                else
                    System.out.print(twoDArray[i][j] + " ");
            }
        }
    }

    private static int[][] swap(int[][] twoDArray) {
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = i + 1; j < twoDArray.length; j++) {
                int temp = twoDArray[i][j];
                twoDArray[i][j] = twoDArray[j][i];
                twoDArray[j][i] = temp;
            }
        }
        return twoDArray;
    }


    private static void merge(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;

        
        ArrayUtils.printArray(array);


    }



}


