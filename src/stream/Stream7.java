package stream;

import java.util.stream.IntStream;

public class Stream7 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .filter(n-> n % 2 == 0)
                .forEach(System.out::println);
    }
}
