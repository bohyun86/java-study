package collection.set.ex;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> cities = new HashSet<>();

        while (true) {
            System.out.println("도시 이름을 입력하세요 (종료하려면 '종료' 입력)");
            String city = scanner.nextLine();
            if (city.equals("종료")) {
                break;
            }

            boolean isNewCity = true;
            for (String existingCity : cities) {
                if (existingCity.equalsIgnoreCase(city)) {
                    isNewCity = false;
                    break;
                }
            }

            if (isNewCity) {
                cities.add(city);
            }
        }

        for (String cityName : cities) {
            System.out.println(cityName);
        }

        scanner.close();
    }
}
