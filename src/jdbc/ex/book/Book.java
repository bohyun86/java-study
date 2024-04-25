package jdbc.ex.book;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int publishYear;
    private String genre;

    public Book(String isbn, String title, String author, int publishYear, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Title: " + title + ", Author: " + author + ", Publish Year: " + publishYear + ", Genre: " + genre;
    }
}

