package generic.ex.ex4;

public class Movie implements Media {
    String director;
    String title;

    public Movie(String director, String title) {
        this.director = director;
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

}
