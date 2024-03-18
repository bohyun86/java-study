package lambda.function;

import java.util.function.Consumer;

public class Function3 {
    public static void main(String[] args) {
        // 매개변수 하나만 있고, 리턴 값 없는 함수형 인터페이스
        Consumer<Integer> oddEven = number -> {
            String string = number % 2 == 0 ? "짝수" : "홀수";
            System.out.println(number + "는 " + string + "입니다.");
        };

        // 변수에 저장된 함수를 실행
        oddEven.accept(3);
        oddEven.accept(4);

        Button duckButton = new Button("오리");
        duckButton.setOnClickListener(() -> System.out.println("꽥꽥"));
        Consumer<Button> clickButton = button -> button.onClick();
        clickButton.accept(duckButton);



    }
}
