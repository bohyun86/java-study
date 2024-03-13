package collection.set.ex;

import java.util.HashSet;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random random = new Random();

        HashSet<Integer> integerHashSet = new HashSet<>();

        System.out.println("로또 번호를 생성합니다. ");
        while (!(integerHashSet.size() == 6)) {
            int num = random.nextInt(1, 46);
            integerHashSet.add(num);
        }

        System.out.println(integerHashSet);

    }
}
