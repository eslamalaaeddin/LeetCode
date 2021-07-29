package Arrays;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr1 = {10, 2, 5, 3};
        int[] arr2 = {7, 1, 14, 11};
        int[] arr3 = {3, 1, 7, 11};

        System.out.println(checkIfExist(arr1));
        System.out.println(checkIfExist(arr2));
        System.out.println(checkIfExist(arr3));
    }

    public static boolean checkIfExist(int[] arr) {
        if (arr == null || arr.length == 0)
            return false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j])
                    return true;
            }
        }
        return false;
    }
}
