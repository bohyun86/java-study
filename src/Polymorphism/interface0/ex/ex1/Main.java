package Polymorphism.interface0.ex.ex1;

public class Main {
    public static void main(String[] args) {
        CDPlayer cdPlayer = new CDPlayer();
        MP3Player mp3Player = new MP3Player();

        play(mp3Player);
        pause(mp3Player);
        stop(mp3Player);

        play(cdPlayer);
        pause(cdPlayer);
        pause(cdPlayer);

    }

    static void play(Playable playable) {
        playable.play();
    }
    static void pause(Playable playable) {
        playable.pause();
    }
    static void stop(Playable playable) {
        playable.stop();
    }

}
