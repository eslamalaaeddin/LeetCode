package Arrays;

public class ArrayUtils {
    public static void printArray(int[] array) {
        if (array.length ==0){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1)
                System.out.println(array[i] + "]");
            else
                System.out.print(array[i] + ", ");
        }
    }

    public static void printArrayTillIndex(int[] array, int index) {
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            if (i == index - 1)
                System.out.println(array[i] + "]");
            else
                System.out.print(array[i] + ", ");
        }
    }
}
