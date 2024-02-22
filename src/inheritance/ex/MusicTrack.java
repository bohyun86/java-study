package inheritance.ex;

public class MusicTrack {
    String title;
    String artist;
    int duration;

    public MusicTrack(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    void play() {
        System.out.printf("Playing %s by %s\n", title, artist);
    }

}
