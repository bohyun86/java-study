package enum0;

public class Enum1 {
    public static void main(String[] args) {
        Week today = Week.MONDAY;
        
        switch (today) {
            case MONDAY -> System.out.println("월요일");
            case TUESDAY -> System.out.println("화요일");
            case WEDNESDAY -> System.out.println("수요일");
            case THURSDAY -> System.out.println("목요일");
            case FRIDAY -> System.out.println("금요일");
            case SATURDAY -> System.out.println("토요일");
            case SUNDAY -> System.out.println("일요일");
        }
        
        for (Week day: Week.values()) {
            System.out.println("day = " + day);
        }
    }
}
