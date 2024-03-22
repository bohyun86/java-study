package quiz.quiz5.q2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            integerSet.add(random.nextInt(1,46));
        }

        System.out.println("로또 번호: " + integerSet);
    }
}
