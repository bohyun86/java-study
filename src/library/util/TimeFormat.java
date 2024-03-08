package library.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = now.format(dateTimeFormatter);
        System.out.println("format = " + format);

        // 날짜의 시간 형식의 문자열을 DateTime 타입으로 변환(파싱)
        LocalTime parse = LocalTime.parse(format, dateTimeFormatter);
        System.out.println("parse = " + parse);

        String str = "2024년 3월 8일";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy년 M월 d일");
        LocalDate parsedOut = LocalDate.parse(str, dateTimeFormatter1);
        System.out.println("parsedOut = " + parsedOut);
    }
}
