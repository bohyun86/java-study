package stream.ex;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<String> catNames = Arrays.asList("Leo", "Milo", "Luna", "Oli", "Zoe", "Bella");

        catNames.stream().filter(name -> name.length() >= 4)
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
