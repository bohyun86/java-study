package stream.ex;

import java.util.*;
import java.util.stream.Collectors;

public class Ex14 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Java의 정석", "컴퓨터 과학", "남궁성", 2013, 1024),
                new Book("모비 딕", "소설", "허먼 멜빌", 1851, 635),
                new Book("클린 코드", "컴퓨터 과학", "로버트 C. 마틴", 2008, 464),
                new Book("햄릿", "연극", "윌리엄 셰익스피어", 1603, 500),
                new Book("데미안", "소설", "헤르만 헤세", 1919, 248),
                new Book("Effective Java", "컴퓨터 과학", "조슈아 블로크", 2018, 412)
        );

        boolean isEnd = false;
        while (!isEnd) {
            System.out.print("실행할 작업을 선택하세요: ");
            int num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1 -> averagePages(books);
                case 2 -> averageYearsByGenre(books);
                case 3 -> printSpecifiedTitleByYearsAndPages(books);
                case 4 -> printBooksOfEachGenre(books);
                case 5 -> printMostPublishedGenre(books);
                case 0 -> {
                    isEnd = true;
                    System.out.println("프로그램을 종료합니다.");
                }
            }
        }
    }

    private static void printMostPublishedGenre(List<Book> books) {
        Map<String, Long> booksCountByGenre = books.stream()
                .collect(Collectors.groupingBy(Book::genre, Collectors.counting()));
        String key = Collections.max(booksCountByGenre.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("가장 많이 책이 출판된 장르: " + key);
    }

    private static void printBooksOfEachGenre(List<Book> books) {
        Map<String, Long> booksCountByGenre = books.stream()
                .collect(Collectors.groupingBy(Book::genre, Collectors.counting()));

        System.out.println("각 장르별 책의 수: " +
                booksCountByGenre.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue())
                        .collect(Collectors.joining(", ", "{", "}")));
    }

    private static void printSpecifiedTitleByYearsAndPages(List<Book> books) {
        // 특정 연도 이후 출판된, 최소 페이지 이상 책의 제목 출력
        System.out.print("조회할 최소 연도를 입력하세요: ");
        int years = Integer.parseInt(scanner.nextLine());
        System.out.print("조회할 최소 페이지 수를 입력하세요: ");
        int pages = Integer.parseInt(scanner.nextLine());
        String collect = books.stream().filter(Book -> Book.publishYear >= years && Book.pages >= pages)
                .map(Book::title).collect(Collectors.joining(", ","[","]"));

        System.out.printf("%d년 이후 출판되고 %d페이지 이상인 책의 제목들: %s\n", years, pages, collect);
    }

    private static void averageYearsByGenre(List<Book> books) {
        // 특정 장르 책의 평균 출반년도 계산
        Map<String, Double> averageYearsByGenre = books.stream().collect(Collectors.groupingBy(Book::genre, Collectors.averagingDouble(Book::publishYear)));
        System.out.print("평균 출판년도를 계산할 장르를 입력하세요: ");
        String genre = scanner.nextLine();
        System.out.printf("[%s] 장르 책의 평균 출판년도: %.0f년\n", genre, averageYearsByGenre.get(genre));
    }

    private static void averagePages(List<Book> books) {
        // 모든 책의 평균 페이지 수 계산
        Double averagePages = books.stream().collect(Collectors.averagingDouble(Book::pages));
        System.out.printf("모든 책의 평균 페이지 수: %.0f 페이지\n", averagePages);
    }

    record Book(String title, String genre, String author, int publishYear, int pages) {
    }
}
