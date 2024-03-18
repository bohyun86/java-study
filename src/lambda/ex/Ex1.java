package lambda.ex;

import java.util.Map;
import java.util.function.BiFunction;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, Integer> userScores = Map.of("Alice", 75, "Bob", 45, "Charlie", 85);

        BiFunction<String, Integer, String> biFunction =
                (name, score) -> score >= 50 ? "합격" : "불합격";

        userScores.forEach(
                (name, score) -> System.out.println(name + ": " + biFunction.apply(name, score)));
    }
}
