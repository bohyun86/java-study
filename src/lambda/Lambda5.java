package lambda;

public class Lambda5 {
    public static void main(String[] args) {
        ParamTwo add = (x, y) -> x + y; // 순수함수

        System.out.println("10 + 20 = " + add.func(10, 20));

        ParamTwo addAndPrint = (x, y) -> {
            int result = x + y;
            System.out.printf("%d + %d = %d\n", x, y, result); // 순수함수 아님
            return result;
        };

        addAndPrint.func(5,6);

    }
}
