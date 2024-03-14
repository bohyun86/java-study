package collection.map.ex;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().replace("[^가-힣]","").split("\\s");

        HashMap<String, Integer> result = new HashMap<>();

        for (String word : str) {
            result.put(word, result.getOrDefault(word, 0) + 1);
        }

        System.out.println("단어 빈도수:");
        result.forEach((key, value) ->
                System.out.println(key + ": " + value));


    }
}
