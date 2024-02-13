package loop;

public class Loop3 {
    public static void main(String[] args) {
        /* do-while문, while문과 유사하지만, 무조건 한 번은 코드를 실행한다.
        do {
            // 반복할 코드
        } while (조건식);
        */
        int i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 3);


        // 일반 while문의 경우 false를 처음부터 만나면 아무 것도 출력되지 않는다.
        i = 1;
        while (i < 3) {
            System.out.println("i = " + i);
            i++;
        }

    }
}
