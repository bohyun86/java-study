package jdbc.ex.book;

import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BookDAO bookDAO = new BookDAO();

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("### 도서 관리 시스템 ###");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 삭제");
            System.out.println("3. 도서 수정");
            System.out.println("4. 도서 조회");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addBook();
                case 2 -> deleteBook();
                case 3 -> updateBook();
                case 4 -> viewBooks();
                case 5 -> {
                    System.out.println("시스템을 종료합니다.");
                    exit = true;
                }
                default -> System.out.println("올바른 메뉴를 선택하세요.");
            }
        }
    }

    private static void addBook() {
        System.out.println("[도서 추가]");
        System.out.print("ISBN 입력: ");
        String isbn = scanner.nextLine();
        System.out.print("제목 입력: ");
        String title = scanner.nextLine();
        System.out.print("저자 입력: ");
        String author = scanner.nextLine();
        System.out.print("출판년도 입력: ");
        int publishYear = Integer.parseInt(scanner.nextLine());
        System.out.print("장르 입력: ");
        String genre = scanner.nextLine();

        Book book = new Book(isbn, title, author, publishYear, genre);
        bookDAO.addBook(book);
        System.out.println("도서가 추가되었습니다.");
    }

    private static void deleteBook() {
        System.out.println("[도서 삭제]");
        System.out.print("삭제할 도서의 ISBN 입력: ");
        String isbn = scanner.nextLine();

        bookDAO.deleteBook(isbn);
        System.out.println("도서가 삭제되었습니다.");
    }

    private static void updateBook() {
        System.out.println("[도서 수정]");
        System.out.print("수정할 도서의 ISBN 입력: ");
        String isbn = scanner.nextLine();

        Book book = bookDAO.getBookByISBN(isbn);

        if (book == null) {
            System.out.println("해당 ISBN의 도서를 찾을 수 없습니다.");
            return;
        }

        System.out.print("새 제목 입력: ");
        String title = scanner.nextLine();
        System.out.print("새 저자 입력: ");
        String author = scanner.nextLine();
        System.out.print("새 출판년도 입력: ");
        int publishYear = Integer.parseInt(scanner.nextLine());
        System.out.print("새 장르 입력: ");
        String genre = scanner.nextLine();

        book.setTitle(title);
        book.setAuthor(author);
        book.setPublishYear(publishYear);
        book.setGenre(genre);

        bookDAO.updateBook(book);
        System.out.println("도서 정보가 업데이트되었습니다.");
    }

    private static void viewBooks() {
        System.out.println("[도서 조회]");
        System.out.println("1. 모든 도서 목록 조회");
        System.out.println("2. ISBN으로 특정 도서 조회");
        System.out.println("3. 저자나 제목으로 도서 검색");

        System.out.print("메뉴 선택: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                List<Book> books = bookDAO.getAllBooks();
                if (books.isEmpty()) {
                    System.out.println("도서 목록이 비어있습니다.");
                } else {
                    books.forEach(System.out::println);
                }
                break;
            case 2:
                System.out.print("ISBN 입력: ");
                String isbn = scanner.nextLine();
                Book book = bookDAO.getBookByISBN(isbn);
                if (book == null) {
                    System.out.println("해당 ISBN의 도서를 찾을 수 없습니다.");
                } else {
                    System.out.println(book);
                }
                break;
            case 3:
                System.out.print("검색어 입력 (저자 또는 제목): ");
                String keyword = scanner.nextLine();
                List<Book> searchResults = bookDAO.searchBooks(keyword);
                if (searchResults.isEmpty()) {
                    System.out.println("해당 검색어로 검색된 도서가 없습니다.");
                } else {
                    searchResults.forEach(System.out::println);
                }
                break;
            default:
                System.out.println("올바른 메뉴를 선택하세요.");
                break;
        }
    }
}

