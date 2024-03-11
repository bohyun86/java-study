package generic.ex.ex5;


public class Movie implements Media{
    String director;
    String title;

    public Movie(String title, String director) {
        this.director = director;
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void getSpeciality() {
        System.out.println("Director: " + director);
    }


}
