package generic.ex.ex5;

public class Book implements Media {
    String author;
    String title;

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void getSpeciality() {
        System.out.println("Author: " + author);
    }
}
