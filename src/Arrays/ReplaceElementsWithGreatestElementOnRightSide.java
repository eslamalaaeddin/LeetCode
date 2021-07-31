package Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        int[] arr1 = {17,18,5,4,6,1};
        int[] arr2 = {};
        int[] arr3 = {6,5,4,3,2,1};//5 4 3 2 1 -1
        int[] arr4 = {1,2,3,4,5,6};//6 6 6 6 6 -1
        int[] arr5 = {1,1,1,1,1,1};

        ArrayUtils.printArray(replaceElements(arr1));
        ArrayUtils.printArray(replaceElements(arr2));
        ArrayUtils.printArray(replaceElements(arr3));
        ArrayUtils.printArray(replaceElements(arr4));
        ArrayUtils.printArray(replaceElements(arr5));


    }

    public static int[] replaceElements(int[] arr) {
        if (arr.length == 1){
            arr[0] = -1;
            return arr;
        }

        for (int i = 0; i < arr.length; i++)
            arr[i] = getLargestRightToElement(arr, i);

        return arr;
    }

    public static int getLargestRightToElement(int[] arr, int elementIndex){
        if (elementIndex == arr.length - 1) return -1;

        int largest = arr[elementIndex + 1];
        for (int i = elementIndex + 1; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }




}
