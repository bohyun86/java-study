package generic.ex.ex4;

import java.util.ArrayList;

public class MediaLibrary<T extends Media> {

    // Media[] mediaList2 = new Media[10];

    ArrayList<T> mediaList = new ArrayList<>();

    public void addMedia(T media) {
        mediaList.add(media);
    }

    public void printMediaTitles() {
        for (T media: mediaList) {
            System.out.println(media.getTitle());
        }
    }
}
