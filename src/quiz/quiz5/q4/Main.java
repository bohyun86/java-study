package quiz.quiz5.q4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                Arrays.asList("지갑", "여권", "선글라스", "책", "삼각대", "충전기", "지도", "겨울옷"));

        // 원본 물품 리스트
        System.out.println("원본 물품 리스트: " + list);

        // 정렬 후 물품 리스트
        Collections.sort(list);
        System.out.println("정렬 후 물품 리스트: " + list);

        // 뒤집은 후 물품 리스트
        Collections.reverse(list);
        System.out.println("뒤집은 후 물품 리스트: " + list);

        // 셔플 후 물품 리스트
        Collections.shuffle(list);
        System.out.println("셔플 후 물품 리스트: " + list);

        // 추가 물품 후 리스트
        list.addAll(Arrays.asList("휴대폰","카메라","책"));
        System.out.println("추가 물품 후 물품 리스트: " + list);

        // 책의 빈도 수
        int numberBook = Collections.frequency(list, "책");
        System.out.println("'책'의 빈도 수: " + numberBook);

        // 중복 제거 후 리스트
        Set<String> set = new HashSet<>(list);
        System.out.println("중복 제거 후 리스트: " + set);

        // 가장 중요한 물품
        System.out.println("가장 중요한 물품(최소값): " + Collections.min(set));

    }
}
