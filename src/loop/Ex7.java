package loop;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // 최대공약수와 최소공배수 구하기
        // 두 개의 자연수를 입력받아, 유클리드 호제법을 사용하여
        // 최대 공약수(GCD)와 최소 공배수(LCM)를 찾는 프로그램을 작성하세요.
        // 최소 공배수는 두 수의 곱을 최대 공약수로 나눈 값으로 구할 수 있습니다.

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 숫자: ");
        int b = scanner.nextInt();

        int gcd = 0, lcm = 0;   // 최대공약수, 최소공배수
        for (int i = 0; i < a - 1; i++) {
            if ((a % (a - i) == 0) && (b % (a - i) == 0)) {
                gcd = (a - i);
                break;
            }
        }
        if (gcd == 0) {
            System.out.println("최대공약수 및 최소공배수가 존재하지 않습니다.");
        } else {
            lcm = a * b / gcd;
            System.out.println("gcd = " + gcd);
            System.out.println("lcm = " + lcm);
        }
    }
}
