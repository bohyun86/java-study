package quiz.quiz5.q3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "나는 집에 간다. 나는 학교에 간다.";
        Map<String, Integer> map = new HashMap<>();
        String[] count = text.replaceAll("[^가-힣\\s]","").split(" ");

        for (String word: count) {
            map.put(word, map.getOrDefault(word,0) + 1);
        }

        System.out.println("단어 빈도수:");
        map.forEach((key, value) -> System.out.printf("%s: %d\n", key, value));

    }
}
