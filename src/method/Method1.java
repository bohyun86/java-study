package method;

public class Method1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int sum = x + y;
        System.out.println("합계 : " + sum);

        int x2 = 3;
        int y2 = 5;
        int sum2 = x2 + y2;
        System.out.println("합계 : " + sum2);

        System.out.println(sum(4,5));

        int number = sum(3, 4);
        System.out.println("number = " + number);
    }

    // 함수 {function)
    // 수학에서 가져온 개념 : 값을 입력하면, 연산을 처리하여 결과를 출력한다.
    // 자바에서는 함수를 메서드(Method)라고 한다.

    /*
    [리턴 타입] [ 메소드 이름] ( [ 매개변수 ... ] ) {
        // 실행할 코드
    }
     */

    // sum 메서드 선언
     public static int sum(int x, int y) {                 // 메서드 시그니처
        int sum = x + y;
        return sum;
    }
}
