package stream.ex;

import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(16, -9, 4, 1, -16, 9, 25);

        scores.stream()
                .filter(num -> num > 0)
                .map(Math::sqrt )
                .forEach(System.out::println);

    }
}
