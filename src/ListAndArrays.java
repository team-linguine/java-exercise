//Given an array/list [] of integers , Find the product of the k maximal numbers.

import java.util.Arrays;

public class ListAndArrays
{
    public static long maxProduct(int[] numbers, int sub_size)
    {
        Arrays.sort(numbers);
        long result = 1;
        for (int i = numbers.length-1;sub_size > 0;sub_size--,i--){
            result*=numbers[i];
        }
        return result; // Do your magic!
    }
}
