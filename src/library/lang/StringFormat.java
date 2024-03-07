package library.lang;

import java.text.MessageFormat;
import java.util.Calendar;

public class StringFormat {
    public static void main(String[] args) {
        // 문자열 포매팅하기
        // 1. printf(): 포멧 형태로 콘솔에 직접 출력
        // 형식지정자를 문자열에 % 기호를 사용하여 삽입할 위치와 방식 지정
        String name = "홍길동";
        int age = 30;
        System.out.printf("이름 : %s, 나이 : %d\n", name, age);

        // 2. String.format(): 포매팅 된 문자열로 반환 - 하위버전에서 실무 사용!
        String format = String.format("이름 : %s, 나이 : %d\n", name, age);

        // 3. MessageFormat.format: 복잡한 포매팅이 필요할 때
        String format1 = MessageFormat.format("이름: {0}, 이름: {1}", name, age);

        // 4. "문자열".formatted("포맷"): 포맷된 문자열을 반환 ! 자바 13버전에서 추가됨.
        String formatted = "이름 : %s, 나이 : %d\n".formatted(name, age);

        // 문자열 포매팅 예시

        // 숫자 또는 금액 포매팅 (%, 천 단위로 콤마형식, %.n 부동소수점 자리수)
        double dollarPrice = 1_234.56;
        String format2 = String.format("가격 : %,.2f 달러", dollarPrice);
        System.out.println(format2);

        // 날짜 시간 포매팅
        Calendar now = Calendar.getInstance();
        String format3 = String.format("현재 날짜: %1$tY년 %1$tm월 %1$td일", now);
        System.out.println(format3);

        // 패딩간격과 정렬하기
        // %숫자s: 숫자 만큼의 자리를 차지 (기본 우측정렬)
        // %-숫자s: 자리를 차지하고 좌측정렬
        String fmt3 = String.format("이름: [[%-10s]]", name);
        System.out.println(fmt3);

        // 대문자 변환하기
        // %S: 영문자 대문자 변환
        String hello = "Hello Java";
        String fmt4 = String.format("인사말 : %S", hello);
        System.out.println(fmt4);

        // 자료형에 따른 형식지정자
        // %s: 문자열, %d: 정수, %f: 실수
        int year = 2024;
        double temp = 12.3;
        String format4 = String.format("연도: %d, 온도: %.1f도", year, temp);
        System.out.println(format4);


    }
}
