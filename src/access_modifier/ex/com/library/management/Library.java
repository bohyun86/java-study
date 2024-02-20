package access_modifier.ex.com.library.management;

public class Library {
    private Book[] books;
    private int index;

    public Library(int capacity) {
        books = new Book[capacity];
    }

    // 도서관에 새 도서 추가
    public void addBook(Book book) {
        if (index <= books.length) {
            books[index] = book;
            index++;
        } else {
            System.out.println("책 보관 한도를 초과했습니다.");
        }
    }

    // 도서관에 있는 모든 도서 출력
    public void listBooks() {
        for (int i = 0; i < index; i++) {
            System.out.printf("%d. 제목: %s, 저자: %s\n", i + 1, books[i].getTitle(), books[i].getAuthor());
        }
    }
}
