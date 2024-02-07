package variable;

public class Var4 {
    public static void main(String[] args) {
        // 두 변수의 값을 교환하기
        int a = 10, b = 20; // A 그릇 10, B 그릇 10
        int temp; // 빈 그릇

        System.out.println("a = " + a + ", b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + ", b = " + b);

    }
}
