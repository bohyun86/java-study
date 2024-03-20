package stream.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        List<MovieRating> ratings = Arrays.asList(
                new MovieRating("Inception", 5),
                new MovieRating("The Godfather", 5),
                new MovieRating("Interstellar", 4),
                new MovieRating("Jurassic Park", 3),
                new MovieRating("The Dark Knight", 5),
                new MovieRating("Pulp Fiction", 4),
                new MovieRating("Some Movie", 2)
        );

        ratings.stream()
                .filter(MovieRating -> MovieRating.rating >= 4)
                .peek(MovieRating-> System.out.printf("점검: %s (%d)\n",MovieRating.movieName,MovieRating.rating))
                .sorted(Comparator.comparing(MovieRating::getMovieName))
                .forEach(System.out::println);
    }
}
