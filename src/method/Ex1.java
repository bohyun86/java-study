package method;

public class Ex1 {
    public static void main(String[] args) {
        // 두 수를 입력받아 뺄셈을 하는 메서드를 만들어주세요.
        sub(5,3);
    }

    public static int sub(int x, int y) {
        int result = x + y;
        System.out.printf("%d - %d = %d", x, y, result);
        return result;
    }
}
