package quiz.quiz4.q3;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate nextWorldCup = LocalDate.of(2026,6,14);

        Period period = Period.between(currentDate, nextWorldCup);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.printf("다음 월드컵은 %d년 %d개월 %d일 후에 개최됩니다.\n", years, months, days);
    }
}
