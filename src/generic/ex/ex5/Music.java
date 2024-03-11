package generic.ex.ex5;

public class Music implements Media {
    String artist;
    String title;

    public Music(String title, String artist) {
        this.artist = artist;
        this.title = title;
    }


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void getSpeciality() {
        System.out.println("Artist: " + artist);
    }
}
