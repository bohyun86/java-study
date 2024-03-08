package library.util.ex;

import java.time.LocalDate;
import java.time.Period;

public class Ex5 {
    public static void main(String[] args) {
        LocalDate dDayOfWorldCup = LocalDate.of(2026, 6, 14);
        LocalDate now = LocalDate.now();

        Period between = Period.between(now, dDayOfWorldCup);
        int years = between.getYears();
        int months = between.getMonths();
        int days = between.getDays();

        System.out.printf("다음 월드컵은 %s년 %s개월 %d일 후에 시작합니다!", years, months, days);
    }
}
