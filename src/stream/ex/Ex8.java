package stream.ex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Ex8 {
    public static void main(String[] args) {
        Map<String, List<String>> userBookRentals = Map.of(
                "user1", Arrays.asList("The Lord of the Rings", "Java Programming"),
                "user2", Arrays.asList("Java Programming", "Effective Java"),
                "user3", Arrays.asList("The Hobbit"),
                "user4", Collections.emptyList() // 이 사용자는 책을 대출하지 않았습니다.
        );

        boolean isAnyBook = userBookRentals.values().stream().anyMatch(List::isEmpty);
        if (isAnyBook) {
            System.out.println("책을 대출하지 않은 사용자가 있습니다.");
        }

        String bookName = "Java Programming";
        boolean isSpecifiedBook = userBookRentals.values().stream().anyMatch(n -> n.contains(bookName));
        if (isSpecifiedBook) {
            System.out.printf("%s 책을 대출한 사용자가 있습니다.\n", bookName);
        }

        String bookName1 = "The Great Gatsby";
        boolean isSpecifiedBook1 = userBookRentals.values().stream().anyMatch(n -> n.contains(bookName1));
        if (!isSpecifiedBook1) {
            System.out.printf("아무도 %s 책을 대출하지 않았습니다.\n", bookName1);
        }
    }
}
