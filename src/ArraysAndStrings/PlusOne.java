package ArraysAndStrings;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits1 = {1,2,3};
        int[] digits2 = {4,3,2,1};
        int[] digits3 = {0};
        int[] digits4 = {9};
        int[] digits5 = {9,8,7,6,5,4,3,2,1,0};

//        ArrayUtils.printArray(plusOne(digits1));//124
//        ArrayUtils.printArray(plusOne(digits2));//4322
//        ArrayUtils.printArray(plusOne(digits3));//1
//        ArrayUtils.printArray(plusOne(digits4));//10
//        ArrayUtils.printArray(plusOne(digits5));

        addOne("123".toCharArray());
        addOne("4321".toCharArray());
        addOne("0".toCharArray());
        addOne("9".toCharArray());
        addOne("9876543210".toCharArray());

    }

    public static int[] plusOne(int[] digits) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int digit : digits) {
            stringBuilder.append(digit);
        }
        char[] chars = stringBuilder.toString().toCharArray();
        //System.out.println(stringBuilder.toString());
//        long resultAsNumber = Long.parseLong(stringBuilder.toString()) + 1;



//        for (char aChar : chars) {
//            System.out.print(" " + aChar);
//        }

        int[] result = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = Integer.parseInt(chars[i] + "");
        }


        return result;
    }

    public static char[] addOne(char[] numberAsChars){
        int lastInteger = Integer.parseInt(numberAsChars[numberAsChars.length - 1] + "");
        char[] newChars = new char[numberAsChars.length + 1];
        if (lastInteger != 9){
            int result = lastInteger + 1;
            numberAsChars[numberAsChars.length - 1] = String.valueOf(result).toCharArray()[0];
        }

        //9999 + 1 --> 10000 --> 1, 0, 0, 0, 0
        else{

            int i = newChars.length - 1;

            for (int k = numberAsChars.length - 1; k >= 0; k--) {
                if (numberAsChars[k] == '9'){
                    newChars[i] = '0';
                    i--;

                    if (k == 0){
                        newChars[i] = 1;
                    }
                }
            }

            for (char newChar : newChars) {
                System.out.print(newChar + " ");
            }

        }
        return newChars;
    }
}
