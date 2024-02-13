package loop;

public class Loop2 {
    public static void main(String[] args) {
        // 1부터 하나씩 증가하는 수를 더하기 1 + 2 + 3 + 4 ...
        int sum = 0;
        int i = 0;
        int end = 3;

        // 반복문을 사용하게 될 경우, 반복 횟수와 요구조건을 유연하게 변경할 수 있다.
        while (i <= end) {
            sum = sum + i;
            System.out.println("sum = " + sum);
            i ++;
        }
    }
}

