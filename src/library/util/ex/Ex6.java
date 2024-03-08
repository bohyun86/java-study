package library.util.ex;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Ex6 {

    public static void main(String[] args) {
        // 뉴욕 시간대에서 오후 3시 설정
        ZonedDateTime nyTime = ZonedDateTime.of(2023, 3, 8, 15, 0, 0, 0, ZoneId.of("America/New_York"));

        // 서울과 런던 시간대로 변환
        ZonedDateTime seoulTime = nyTime.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonTime = nyTime.withZoneSameInstant(ZoneId.of("Europe/London"));

        // 날짜와 시간 형식 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("a h시");

        // 결과 출력
        System.out.println("회의는 뉴욕 기준 오후 3시에 시작합니다.");
        System.out.printf("서울에서는 회의가 %s에 시작합니다.\n", seoulTime.format(formatter));
        System.out.printf("런던에서는 회의가 %s에 시작합니다.\n", londonTime.format(formatter));
    }
}
