package inheritance.ex;

public class ReferenceBook extends Book{

    private String field;

    public ReferenceBook(String title, String author, int year, String field) {
        super(title, author, year);
        this.field = field;
    }

    @Override
    void displayInfo() {
        System.out.printf("Title: %s, Author: %s, Year: %d, field: %s\n", title, author, year, field);
    }
}
