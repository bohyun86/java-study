package collection.list.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            integerList.add(i);
        }

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 2 == 0) {
                System.out.println(integerList.get(i));
            }
        }

    }
}
