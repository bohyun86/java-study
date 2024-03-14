package collection.set.ex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation implements Comparable<Reservation> {
    private LocalDateTime start;
    private String name;
    private String place;

    public Reservation(String start, String name, String place) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분");
        this.start = LocalDateTime.parse(start, dateTimeFormatter);
        this.name = name;
        this.place = place;
    }

    @Override
    public int compareTo(Reservation o) {
        return this.start.compareTo(o.start);
    }

    @Override
    public String toString() {
        return "예약 시간: %s, %s, %s".formatted(this.start, this.place, this.name);
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
