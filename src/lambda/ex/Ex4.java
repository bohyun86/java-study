package lambda.ex;

import java.util.Arrays;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "python", "swift", "cpp", "ai");

        languages.sort((x, y) -> x.length() - y.length());

        languages.forEach(System.out::println);
    }
}
