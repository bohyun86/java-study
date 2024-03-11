package generic.ex.ex5;

import java.util.ArrayList;
import java.util.List;

public class MediaLibraryMain {
    public static void main(String[] args) {
        List<Media> myMediaList = new ArrayList<>();
        myMediaList.add(new Book("1984", "George Orwell"));
        myMediaList.add(new Movie("The Matrix", "Lana and Lilly Wachowski"));

        printMediaDetails(myMediaList);
    }

    static public void printMediaDetails(List<Media> mediaList) {
        for (Media media : mediaList) {
            System.out.println("Title: " + media.getTitle());
            media.getSpeciality();
            System.out.println();
        }
    }
}
