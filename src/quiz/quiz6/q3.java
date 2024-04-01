package quiz.quiz6;

import java.util.Arrays;
import java.util.List;

public class q3 {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(16, -9, 4, 1, -16, 9, 25);

        scores.stream().filter(integer -> integer >= 0)
                .map(Math::sqrt)
                .forEach(System.out::println);
    }
}
