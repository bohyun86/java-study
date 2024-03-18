package lambda;

public class Lambda1 {
    public static void main(String[] args) {
        // 익명 객체
        action(new Calculable() {
            @Override
            public void calculate(int x, int y) {
                int result = x + y;
                System.out.println(result);
            }
        });

        action((x, y) -> {
            int result = x + y;
            System.out.println(result);
        });


    }

    // 매개변수에 함수형 인터페이스를 사용한 메서드
    static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(x, y);
    }
}
