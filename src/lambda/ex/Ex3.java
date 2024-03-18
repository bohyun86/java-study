package lambda.ex;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class Ex3 {
    public static void main(String[] args) {
        // 입력 매개변수가 하나면 소괄호 생략
        // 본문이 리턴값 한 줄일때 중괄호, return 생략

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");

        Function<String, Integer> calculAge = x -> {
            LocalDate now = LocalDate.now();
            LocalDate birthday = LocalDate.parse(x, dateTimeFormatter);
            return Period.between(birthday, now).getYears();
        };

        System.out.println(calculAge.apply("19861107"));
    }
}
