package generic.ex.ex4;

public class Music implements Media{
    String artist;
    String title;

    public Music(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }


    @Override
    public String getTitle() {
        return title;
    }
}
