package quiz.quiz6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class q1 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "python", "swift", "cpp","ai");

        languages.sort(Comparator.comparingInt(String::length));
        Consumer<String> consumer = System.out::println;

        languages.forEach(consumer);
    }
}
