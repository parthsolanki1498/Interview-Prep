
import java.util.HashMap;
import java.util.Map;

/*
 * Write Java code snippet to count number of 1s, 2s, 3s in an array
 * Example - [1,2,2,3,3,4,4,1,2,3]
 * 1 - 2
 * 2 - 3
 * 3 - 3
 */
public class CountOccurance {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,1,2,3,1,2,3};

        // Using HashMap to store the frequency count
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurance
        for(int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Printing out count for 1s, 2s and 3s
        System.out.println("Count of 1s: " + countMap.getOrDefault(1, 0));
        System.out.println("Count of 2s: " + countMap.getOrDefault(2, 0));
        System.out.println("Count of 3s: " + countMap.getOrDefault(3, 0));
    }
}
