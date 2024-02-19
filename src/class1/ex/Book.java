package class1.ex;

public class Book {
    String title;           // 제목
    String author;          // 저자
    String isbn;            // 국제표준도서번호
    boolean isAvailable;    // 대여 가능 여부

    Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    Book(String title, String author) {
        this(title,author,"000-0000",true);
        this.title = title;
        this.author = author;
    }

    boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.printf("%s를(을) 대여 하였습니다.\n", title);
            return true;
        } else {
            System.out.printf("%s는 이미 대여 중 입니다..\n", title);
            return false;
        }
    }

    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.printf("%s를(을) 반납 완료하였습니다.\n", title);
        } else {
            System.out.println("책을 빌려간 적이 없습니다.");
        }
    }

    void printInfo() {
        System.out.printf("제목: %s, 저자: %s, 도서번호: %s, 대여가능여부: %b\n", title, author, isbn, isAvailable);
    }
}
