package stream.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        List<City> itinerary = Arrays.asList(
                new City("서울", Arrays.asList("경복궁", "남산타워", "북촌한옥마을")),
                new City("부산", Arrays.asList("해운대", "광안리", "태종대", "남산타워")),
                new City("제주", Arrays.asList("성산일출봉", "만장굴", "북촌한옥마을"))
        );

        List<String> allAttractions = new ArrayList<>();
        itinerary.stream().forEach(City -> allAttractions.addAll(City.getAttractions()));

        itinerary.stream()
                .flatMap(City -> City.getAttractions().stream())
                .distinct().sorted().forEach(System.out::println);
    }
}
