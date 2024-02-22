package inheritance.ex;

public class ClassicalMusicTrack extends MusicTrack{
    private String composer;

    public ClassicalMusicTrack(String title, String artist, int duration, String composer) {
        super(title, artist, duration);
        this.composer = composer;
    }
    @Override
    void play() {
        System.out.printf("Playing %s by %s, Composer: %s\n", title, artist,composer);
    }
}
