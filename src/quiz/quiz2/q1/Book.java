package quiz.quiz2.q1;

public class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void displayInfo() {
        System.out.printf("Title: %s, Author: %s, Year: %d\n", title, author, year);
    }
}
