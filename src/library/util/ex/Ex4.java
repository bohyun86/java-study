package library.util.ex;

import java.time.LocalDate;
import java.time.Period;

public class Ex4 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(1986,11,7);
        birthday = birthday.withYear(now.getYear());
        if (now.isAfter(birthday)) {
            Period birthdayLeft = Period.between(birthday, now);
            System.out.println("birthdayLeft = " + birthdayLeft);
            int days = birthdayLeft.getDays();
            int monthsToDays = birthdayLeft.getMonths() * 30;
            System.out.printf("다음 생일까지 %d일 남았습니다.", days + monthsToDays);
        } else {
            Period birthdayLeft = Period.between(now, birthday);
            System.out.println("birthdayLeft = " + birthdayLeft);
            int days = birthdayLeft.getDays();
            int monthsToDays = birthdayLeft.getMonths() * 30;
            System.out.printf("다음 생일까지 %d일 남았습니다.", days + monthsToDays);
        }
    }
}
