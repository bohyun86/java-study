package collection.map.ex;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    static Map<String, Boolean> library = new HashMap<>();

    public static void main(String[] args) {


        addBook("91011");
        addBook("1234");
        addBook("5678");


        returnBook("91011");
        borrowBook("1234");
        returnBook("910111");

        printStatus();


    }

    private static void addBook(String id) {
        library.put(id, false);
    }

    private static void printStatus() {
        var entries = library.entrySet();
        for (Map.Entry<String, Boolean> book : entries) {
            String status = book.getValue() ? "(대출중)" : "(대출가능)";
            System.out.printf("도서ID: %s, 상태: %s\n", book.getKey(),status);
        }
    }

    private static void borrowBook(String id) {
        try {
            if (!library.get(id)) {
                library.put(id, true);
            } else {
                System.out.println("대출된 책입니다. .");
            }
        } catch (NullPointerException e) {
            System.out.println("도서관에서 취급하지 않는 책입니다.");
        }
    }

    private static void returnBook(String id) {
        try {
            if (library.get(id)) {
                library.put(id, false);
            } else {
                System.out.println("대출되지 않은 책입니다..");
            }
        } catch (NullPointerException e) {
            System.out.println("도서관에서 취급하지 않는 책입니다.");
        }
    }
}
