package stream.ex;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Ex10 {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(88, 92, 75, 65, 97, 85, 100, 67);
        OptionalDouble average = grades.stream().mapToInt(Integer::intValue).average();
        if (average.isPresent()) {
            System.out.printf("평균 성적: %.3f\n", average.getAsDouble());
        }
        OptionalInt max = grades.stream().mapToInt(Integer::intValue).max();

        if (average.isPresent()) {
            System.out.printf("최고 성적: %d\n", max.getAsInt());
        }

        long count = grades.stream().filter(n -> n > average.getAsDouble()).count();

        System.out.println("평균 이상 성적 학생 수: " + count);
    }
}
