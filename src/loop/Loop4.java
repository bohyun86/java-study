package loop;

public class Loop4 {
    public static void main(String[] args) {
        /* break문
        while (조건식) {
            // code1
            break;  //  code2를 실행하지 않고 반복문을 종료한다.
            // code2
        }
         */
        int sum = 0;
        int i = 1;
        while (true) {
            sum = sum + i;
            // 만약 i가 10보다 크다라는 조건을 만족하면 break문이 수행되고 while문이 종료된다
            if (i > 10) {
                System.out.println("i = " + i);
                break;
            }
            i++;
        }
    }
}
