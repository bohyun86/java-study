package quiz.quiz2.q1;

public class ReferenceBook extends Book {
    String field;

    public ReferenceBook(String title, String author, int year, String field) {
        super(title, author, year);
        this.field = field;
    }

    @Override
    void displayInfo() {
        System.out.printf("Title: %s, Author: %s, Year: %d, Field: %s\n", title, author, year, field);
    }
}
