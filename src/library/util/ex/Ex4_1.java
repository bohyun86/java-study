package library.util.ex;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex4_1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate birthdayThisYear = LocalDate.of(now.getYear(), 11, 7);

        // If the birthday has already occurred this year, calculate time until next year's birthday.
        if (now.isAfter(birthdayThisYear)) {
            birthdayThisYear = birthdayThisYear.plusYears(1);
        }

        long daysUntilBirthday = ChronoUnit.DAYS.between(now, birthdayThisYear);
        System.out.printf("다음 생일까지 %d일 남았습니다.", daysUntilBirthday);
    }
}
