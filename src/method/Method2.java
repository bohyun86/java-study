package method;

public class Method2 {
    public static void main(String[] args) {
        header();       // 메서드 호출
        System.out.println("자바 프로그램을 코딩하고 있습니다.");
        System.out.println("각종 연산을 수행합니다...");
        footer();
    }

    // 메서드 정의
    public static void header() {
        System.out.println("=== 자바 프로그램이 시작되었습니다. ===");
        return;     // 아무것도 반환하지 않고 함수를 종료한다.
    }

    public static void footer() {
        System.out.println("=== 자바 프로그램이 종료되었습니다. ===");
        return;
    }
}
