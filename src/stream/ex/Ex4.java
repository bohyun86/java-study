package stream.ex;

import java.util.Map;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        Map<String, Integer> movieRatings = Map.of("The Shawshank Redemption", 9, "The Godfather", 9, "The Dark Knight", 8, "Pulp Fiction", 8, "Fight Club", 7);


        Stream<Map.Entry<String, Integer>> entryStream = movieRatings
                .entrySet().stream();
        Stream<String> keySetStream = movieRatings.keySet().stream();
        Stream<Integer> valueStream = movieRatings.values().stream();

        entryStream.filter(entry-> entry.getValue() >= 8)
                .forEach(entry-> System.out.printf("%s - %d\n", entry.getKey(), entry.getValue()));
    }
}
