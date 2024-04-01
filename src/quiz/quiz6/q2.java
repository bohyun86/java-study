package quiz.quiz6;

import java.util.Map;
import java.util.function.BiFunction;

public class q2 {
    public static void main(String[] args) {
        Map<String, Integer> userScores = Map.of("Alice", 75, "Bob", 45, "Charlie", 85);

        BiFunction<String, Integer, String> biFunction = new BiFunction<String, Integer, String>() {
            @Override
            public String apply(String s, Integer integer) {
                return integer >= 50 ? s + ": 합격": s + ": 불합격";
            }
        };

        userScores.forEach((key, value) -> System.out.println(biFunction.apply(key, value)));
    }
}
