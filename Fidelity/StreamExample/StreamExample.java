import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        
        // Sample list of integers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Stream pipline to filter even numbers, double them and collect to a list
        List<Integer> result = numbers.stream()                   // Converts list to stream
                                .filter(n -> n % 2 == 0)          // Filters even numbers
                                .map(n -> n * 2)                  // Double the numbers
                                .collect(Collectors.toList());    // Collect the result into List

        // Print the result
        System.out.println(result); // Output : [4,8,12,16,20]
    }
}