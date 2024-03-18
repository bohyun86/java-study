package lambda;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {
    // 메서드 참조
    // 이미 선언된 메서드 또는 생성자의 이름을 참조하여 람다식의 축약형으로 사용할 수 있게 함.
    public static void main(String[] args) {
        BinaryOperator<Integer> returnMax
                // = (left, right) -> Math.max(left, right);
                // 입력값변수           // 본문에 전달
                // 불필요한 매개변수 (전달 역할만 하는)를 지우고 축약형으로 나타냄
                = Math::max;

    Integer maxValue = returnMax.apply(10, 20);
        System.out.println(maxValue);

    // 정적 메서드를 참조할 경우
    // 클래스 이름 뒤에 :: 기호를 붙이고 정적 메서드 이름

        Consumer<String> printer = System.out::println;     // 메서드의 참조값 주소
        Consumer<String> printer1 = x -> System.out.println(x);     // 메서드의 참조값 주소

        printer.accept("출력해주는 함수에요");

        int i = Integer.parseInt("123");

        // 메서드 참조를 사용한 경우
        Function<String, Integer> integerFunction = Integer::parseInt;
        Integer apply = integerFunction.apply("534");
        System.out.println(apply);
    }
}
