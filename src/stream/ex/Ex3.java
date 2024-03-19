package stream.ex;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<String> alphabets = Arrays.asList("b", "A", "d", "C", "f", "e", "D", "c", "F", "B", "E");

        alphabets.stream().sorted(String.CASE_INSENSITIVE_ORDER)
                .forEach(System.out::println);

    }
}
