
import java.util.Arrays;

/*
 * Given an array arr of size N, containing positive and negative integers, rearrange the array such that
 * every non-negative integer is followed by a negative integer and vice-versa.
 * 
 * Input:
 * array = {4, -9, -2, 6, -8}
 * Output: {-9, 4, -2, 6, -8}

 * Input:
 * array = {1, 2, 3, -5}
 * Output: {-5, 1, 2, 3}
 */

public class RearrangeAlternately {
    @SuppressWarnings("ImplicitArrayToString")
    public static void main(String[] args) {
        RearrangeAlternately approach1 = new RearrangeAlternately();

        int nums[] = new int[]{3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(approach1.myApproach(nums)));

    }

    public int[] myApproach(int[] nums) {
        int n = nums.length;
        int[] positive = new int[n/2];
        int[] negative = new int[n/2];
        int[] result = new int[n];

        int posIndex = 0;
        int negIndex = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] > 0 ) {
                positive[posIndex] = nums[i];
                posIndex++;
            } else {
                negative[negIndex] = nums[i];
                negIndex++;
            }
        }
        posIndex = 0;
        negIndex = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                result[i] = positive[posIndex];
                posIndex++;
            } else {
                result[i] = negative[negIndex];
                negIndex++;
            }
        }

        return result;
    }
}
