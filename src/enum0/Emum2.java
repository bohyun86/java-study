package enum0;

public class Emum2 {
    public static void main(String[] args) {
        Season season = Season.SPRING;

        // 열거형의 이름을 반환
        System.out.println("현재 계절은 " + season.name() + "입니다.");

        // 열거형의 순서를 반환 (0부터 시작)
        System.out.println("계절의 순서는 " + season.ordinal() + "입니다");

        // 문자열의 기준으로 열거형 타입을 반환
        Season summer = Season.valueOf("SUMMER");

        System.out.println("여름은 " + summer + "입니다.");
    }
    enum Season {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER
    }
}
