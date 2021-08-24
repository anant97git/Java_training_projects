package third;

// converting array into streams. stream is a type of API
import java.util.Arrays;
public class JavaForEachArray {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 2, 1, 6, 7 };
    
        Arrays.stream(nums).forEach((e) -> { System.out.println(e); });
    }
}