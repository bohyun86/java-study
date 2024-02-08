package operator;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // int형 변수 score를 선언하고
        // score가 80점 이상이고 100점 이하면 true를 출력, 아니면 false를 출력하세요.

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        boolean result = (score >= 80 && score <= 100) ? true : false;
        System.out.println("result = " + result);

    }
}