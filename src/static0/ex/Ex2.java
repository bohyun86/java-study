package static0.ex;

import static static0.ex.MathUtility.*;

public class Ex2 {

    // 스태틱 import를 사용하면 클래명을 사용하지 않고 매서드를 사용할 수 있다.
    public static void main(String[] args) {
        System.out.println("Max of 10, 20: " + max(10, 20));
        System.out.println("Min of 10, 20: " + min(10, 20));
        System.out.println("Sum of 10, 20: " + sum(10, 20));
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
