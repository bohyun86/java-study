package method;

import javax.lang.model.SourceVersion;

public class Method5 {
    public static void main(String[] args) {
        // 자바에서 메소드는 변수의 값을 복사해서 대입한다.
        int number = 3;
        System.out.println("메소드 호출 전 : " + number);
        multiply2(number);
        System.out.println("메소드 호출 후 : " + number);
    }

    public static void multiply2(int number) {
        // 메인 메소드의 number의 multiply2 메소드의 Number는 다른 값이다.
        // 메인 메소드의 number를 복사한 값이다.
        // 다른 메소드에서 변경된 number의 값은 메인 메소드의 number에 영향을 주지 않는다.
        int result = number * 2;
        System.out.println(number + " * 2 = " + result);
    }
}
