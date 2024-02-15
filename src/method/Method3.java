package method;

public class Method3 {
    public static void main(String[] args) {
        boolean result1 = isOdd(3);
        System.out.println("result = " + result1);
    }

    // 리턴 타입이 있는 경우 반드시 리턴이 필요하다.
    public static boolean isOdd(int number) {
        // 홀수면 true, 짝수면 false를 반환(리턴)하는 메서드
        if (number % 2 == 1) {
            return true;            // if 조건이 만족할 때는 true가 반환
        } else {
            // if 조건이 만족되지 않을 때도 return이 존재해야 한다.
            // 조건문의 모든 경우에 리턴이 존재하지 않으면 커파일 에러 발생
            return false;
        }
    }
}
