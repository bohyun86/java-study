package inheritance.ex;

public class PopMusicTrack extends MusicTrack{
    private String album;

    public PopMusicTrack(String title, String artist, int duration, String album) {
        super(title, artist, duration);
        this.album = album;
    }

    @Override
    void play() {
        System.out.printf("Playing %s by %s, Album: %s\n", title, artist, album);
    }
}
