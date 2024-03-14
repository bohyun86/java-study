package collection.set.ex;

import java.util.TreeSet;

public class Ex6 {
    public static void main(String[] args) {
        TreeSet<Reservation> reservations = new TreeSet<>();
        reservations.add(new Reservation("2023년 10월 10일 12시 00분","김길동","회의실"));
        reservations.add(new Reservation("2023년 10월 10일 10시 00분","홍길동","회의실"));
        reservations.add(new Reservation("2023년 10월 11일 10시 00분","홍길서","회의실"));
        reservations.add(new Reservation("2023년 10월 10일 15시 00분","홍길남","회의실"));

        for (Reservation reservation : reservations) {
            System.out.println(reservation.toString());
        }


    }

}
