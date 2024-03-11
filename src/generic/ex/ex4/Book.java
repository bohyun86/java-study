package generic.ex.ex4;

public class Book implements Media{
    String author;
    String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
