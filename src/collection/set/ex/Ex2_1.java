package collection.set.ex;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 중복 제거 도시
        Set<String> citySet = new HashSet<>();

        while(true) {
            System.out.print("도시 이름을 입력하세요 (종료하려면 '종료' 입력): ");
            String city = scanner.nextLine();

            if (city.equals("종료")) break;

            citySet.add(city.toLowerCase());
        }

        for (String city : citySet) {
            System.out.println(city.substring(0, 1).toUpperCase()
                            // 첫 글자는 대문자로 출력
                            + city.substring(1).toLowerCase()
                    // 두번째 글자부터는 소문자
            );
        }
    }
}
