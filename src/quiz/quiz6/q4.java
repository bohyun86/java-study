package quiz.quiz6;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class q4 {
    public static void main(String[] args) {
        List<City> itinerary = Arrays.asList(
                new City("서울", Arrays.asList("경복궁", "남산타워", "북촌한옥마을")),
                new City("부산", Arrays.asList("해운대", "광안리", "태종대", "남산타워")),
                new City("제주", Arrays.asList("성산일출봉", "만장굴", "북촌한옥마을")));

        // 모든 도시의 관광지 리스트를 합칩니다.
        Set<String> attractions = new TreeSet<>();
        itinerary.stream().map(n -> n.attractions).forEach(attractions::addAll);

        // 관광지를 출력합니다.
        attractions.forEach(System.out::println);

    }
}
