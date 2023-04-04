import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromArray {
    public static void main(String[] args) {

        String[] testArray = { "a", "b", "c", "d", "e" };

        // Get Stream using the Arrays.stream
        Stream<String> testStream1 = Arrays.stream(testArray);
        testStream1.forEach(x -> System.out.println(x));

        // Get Stream using the Stream.of
        Stream<String> testStream2 = Stream.of(testArray);
        testStream2.forEach(x -> System.out.println(x));
    }
}
