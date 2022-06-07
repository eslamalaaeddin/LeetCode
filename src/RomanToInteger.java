import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        int[] n1 = {2, 2, 1};
        int[] n2 = {4, 1, 2, 1, 2};
        int[] n3 = {1};

//        System.out.println(singleNumber(n1));
//        System.out.println(singleNumber(n2));
//        System.out.println(singleNumber(n3));

    }

    //M CM XC IV
//    public static int romanToInt(String s) {
//        List<String> list = new ArrayList<>();
//        Map<String, Integer> specials = new HashMap<>();
//        specials.put("IV", 4);
//        specials.put("IX", 9);
//        specials.put("XL", 40);
//        specials.put("XC", 90);
//        specials.put("CD", 400);
//        specials.put("CM", 900);
//
//        char[] numberAsArray = s.toCharArray();
//        int result = 0;
//        for (int i = 0; i < numberAsArray.length - 1; i++)
//            list.add(numberAsArray[i] + "" + numberAsArray[i + 1]);
//        for (String two : list) {
//            if (specials.containsKey(two))
//                result += specials.get(two);
//            else
//                result +=
//        }
//
//        System.out.println(list);
//        return result;
//    }


//    public static int singleNumber(int[] nums) {
//        int number = 0;
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] - nums[i+1]){
//                number = nums[i];
//                break;
//            }
//        }
//        return number;
//    }
}
