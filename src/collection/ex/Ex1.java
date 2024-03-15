package collection.ex;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                Arrays.asList("지갑", "여권", "선글라스", "책", "삼각대", "충전기", "지도", "겨울옷")
        );

        System.out.println("원본 물품 리스트: " + list);

        Collections.sort(list);
        System.out.println("정렬 후 물품 리스트: " + list);

        Collections.reverse(list);
        System.out.println("뒤집은 후 물품 리스트: " + list);

        Collections.shuffle(list);
        System.out.println("셔틀 후 물품 리스트: " + list);

        list.addAll(
                Arrays.asList("휴대폰", "카메라", "책")
        );
        System.out.println("추가 후 물품 리스트: " + list);

        int bookNum = Collections.frequency(list, "책");
        System.out.println("'책'의 빈도 수: " + bookNum);

        Set<String> listSet = new HashSet<>(list);
        System.out.println("중복 제거 후 리스트: " + listSet);

        String minValue = Collections.min(listSet);
        System.out.println("가장 중요한 물품(최소값): " + minValue);
    }
}
